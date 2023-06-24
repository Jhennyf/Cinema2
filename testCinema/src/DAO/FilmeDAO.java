/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Filme;
import Factory.ConnectBD;

/**
 *
 * @author jhenn
 */
public class FilmeDAO {

    private Connection conn;

    public FilmeDAO() {
        this.conn = new ConnectBD().getConnection();
    }

    public void cadastrar(Filme filme) {
        try {
            String sql = "insert into filme (titulo, linkImagem, sinopse, duracao, genero, classeIdade) values (?, ?, ?, ?, ?, ?)";
            PreparedStatement psm = conn.prepareStatement(sql);
            psm.setString(1, filme.getTitulo());
            psm.setString(2, filme.getLink());
            psm.setString(3, filme.getSinopse());
            psm.setInt(4, filme.getDuracao());
            psm.setString(5, filme.getGenero());
            psm.setInt(6, filme.getClasseIdade());

            psm.execute();
            psm.close();

            System.out.println("Cadastrado! ");

        } catch (Exception e) {
            System.out.println("Erro ao realizar cadastro. " + e);

        }
    }

    public Filme buscar(int i) {
        try {
            int id = i;
            String sql = "SELECT * FROM `filme` WHERE id = " + id;
            PreparedStatement psm = conn.prepareStatement(sql);

            ResultSet result = psm.executeQuery();
            Filme f = new Filme();
            if (result.next()) {
                f.setIdFilme(result.getInt("id"));
                f.setTitulo(result.getString("titulo"));
                f.setSinopse(result.getString("sinopse"));
                f.setClasseIdade(result.getInt("classeIdade"));
                f.setDuracao(result.getInt("duracao"));
                f.setGenero(result.getString("genero"));
                f.setLink(result.getString("linkImagem"));
            }
            return f;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void delete(int id) throws SQLException{
        String sql = "DELETE FROM filme WHERE id = ?";
        PreparedStatement psm = null;
        ResultSet result = null;
        
        try {
            psm = conn.prepareStatement(sql);
            result = psm.executeQuery();
            psm.setInt(1, id);
            psm.execute();
            if (psm.getUpdateCount() > 0){
		JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            }else JOptionPane.showMessageDialog(null, "Não foi possÃ­vel remover!!");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (psm != null) {
                     psm.close();
		}if (conn != null) {
                        conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
			}
		} 
    }

    public List<Filme> listarFilmes() {
        List<Filme> lista = new ArrayList<Filme>();
        String sql = "select * from filme";
        PreparedStatement psm = null;
        ResultSet result = null;
        try {
            psm = conn.prepareStatement(sql);
            result = psm.executeQuery();
            while (result.next()) {
                Filme f = new Filme();
                f.setIdFilme(result.getInt("id"));
                f.setTitulo(result.getString("titulo"));
                f.setSinopse(result.getString("sinopse"));
                f.setClasseIdade(result.getInt("classeIdade"));
                f.setDuracao(result.getInt("duracao"));
                f.setGenero(result.getString("genero"));
                f.setLink(result.getString("linkImagem"));
                lista.add(f);
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return null;
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (psm != null) {
                    psm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

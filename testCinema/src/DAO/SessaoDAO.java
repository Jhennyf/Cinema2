/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Factory.ConnectBD;
import model.Sessao;

/**
 *
 * @author jhenn
 */
public class SessaoDAO {

    private Connection conn;

    public SessaoDAO() {
        this.conn = (Connection) new ConnectBD().getConnection();
    }

    public void cadastrar(Sessao sessao) {

        try {
            String sql = "insert into sessao (horario, tipo, idFilme) values (?,?,?)";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, sessao.getHorario());
            pstm.setString(2, sessao.getTipo());
            pstm.setInt(3, sessao.getIdFilme());

            pstm.execute();
            pstm.close();

            System.out.println("Cadastrado! ");
        } catch (SQLException e) {
            System.out.println("Erro ao realizar cadastro. " + e);
        }
    }

    public Sessao buscar(int i) {
        try {
            int id = i;
            String sql = "SELECT * FROM `sessao` WHERE id = " + id;
            PreparedStatement psm = (PreparedStatement) conn.prepareStatement(sql);

            ResultSet result = psm.executeQuery();
            Sessao s = new Sessao();
            if (result.next()) {
                s.setIdFilme(result.getInt("id"));
                s.setTitulo(result.getString("horario"));
                s.setSinopse(result.getString("tipo"));
                s.setClasseIdade(result.getInt("idFilme"));
            }
            return s;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void delete(int id) throws SQLException{
        String sql = "DELETE FROM sessao WHERE id = ?";
        java.sql.PreparedStatement psm = null;
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

    public List<Sessao> listarSessao(int i) {
        try {
            int id = i;
            List<Sessao> lista = new ArrayList<>();

            String sql = "select * from sessao where sessao_id = " + id;
            PreparedStatement psm = (PreparedStatement) conn.prepareStatement(sql);

            ResultSet result = psm.executeQuery();

            while (result.next()) {

                String sql2 = "select * from sessao here id =" + result.getInt("sessao_id");
                PreparedStatement psm2 = (PreparedStatement) conn.prepareStatement(sql);

                ResultSet result2 = psm2.executeQuery();

                while (result.next()) {
                    Sessao s = new Sessao();

                    s.setIdFilme(result2.getInt("id"));
                    s.setTitulo(result2.getString("horario"));
                    s.setSinopse(result2.getString("tipo"));
                    s.setClasseIdade(result2.getInt("idFilme"));
                    lista.add(s);
                }
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return null;
        }
    }
}

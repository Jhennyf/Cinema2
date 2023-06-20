/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConnectBD;
import model.Filme;

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
             psm.setInt(4,filme.getDuracao());
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
    
    public List<Filme> listarFilmes(int i){
        try {
            int id = i;
            List<Filme> lista = new ArrayList<>();
            
            String sql = "select * from filme where filme_id = " + id;
            PreparedStatement psm = conn.prepareStatement(sql);
            
            ResultSet result = psm.executeQuery();
            
            while(result.next()){
            
                String sql2 = "select * from filme here id =" + result.getInt("filme_id");
                PreparedStatement psm2 = conn.prepareStatement(sql);
            
                ResultSet result2 = psm2.executeQuery();
                
                while(result.next()){
                Filme f = new Filme();
                
                f.setIdFilme(result2.getInt("id"));
                f.setTitulo(result2.getString("titulo"));
                f.setSinopse(result2.getString("sinopse"));
                f.setClasseIdade(result2.getInt("classeIdade"));
                f.setDuracao(result2.getInt("duracao"));
                f.setGenero(result2.getString("genero"));
                f.setLink(result2.getString("linkImagem"));
                
                lista.add(f);
                }
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Erro: " +  e);
             return null;
        }
    }
}

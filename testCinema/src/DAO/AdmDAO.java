package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.ConnectBD;
import model.ADM;

/**
 *
 * @author jhenn
 */
public class AdmDAO {

    private Connection conn;

    public AdmDAO() {
        this.conn = new ConnectBD().getConnection();
    }

    public void cadastrar(ADM adm) {
        String sql = "insert into adm (nome, senha) values (?,?)";
        PreparedStatement pstm = null;
    try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, adm.getNome());
            pstm.setString(2, adm.getSenha());

            pstm.execute();
            pstm.close();

            System.out.println("Cadastrado! ");
        } catch (SQLException e) {
            System.out.println("Erro ao realizar cadastro. " + e);
        }
    }

    public ADM Login(String nome, String senha) {
        String sql = "select nome, senha from adm where nome = ? and senha = ? ";
        PreparedStatement pstm = null;
        ResultSet rset = null;
        ADM adm = null;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.setString(2, senha);
            rset = pstm.executeQuery();
            if (rset.next()) {
               String nomeUsuario = rset.getString("nome");
               String senhaSenha = rset.getString("senha");
                adm = new ADM(nome, senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adm;
    }
}

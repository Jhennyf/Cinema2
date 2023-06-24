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
import Factory.ConnectBD;
import model.Pessoa;

/**
 * b
 *
 * @author jhenn
 */
public class ClienteDAO {

    private Connection conn;

    public ClienteDAO() {
        this.conn = new ConnectBD().getConnection();
    }

    public void cadastrar(Pessoa cliente) {
        String sql = "insert into cliente (cpf, senha, email, nome, idade, celular) values (?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getSenha());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getNome());
            pstm.setInt(5, cliente.getIdade());
            pstm.setString(6, cliente.getCelular());

            pstm.execute();
            pstm.close();
            System.out.println("Cadastrado! ");
        } catch (SQLException e) {
            System.out.println("Erro ao realizar cadastro. " + e);
        }
    }

    public List<Pessoa> listarCliente() {

        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "select * from cliente";
        PreparedStatement psm = null;
        ResultSet rset = null;

        try {
            psm = conn.prepareStatement(sql);
            rset = psm.executeQuery();
            while (rset.next()) {
                Pessoa p = new Pessoa();

                p.setCpf(rset.getString("cpf"));
                p.setSenha(rset.getString("senha"));
                p.setEmail(rset.getString("email"));
                p.setNome(rset.getNString("nome"));
                p.setIdade(rset.getInt("idade"));
                p.setCelular(rset.getString("celular"));
                lista.add(p);
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            return null;
        } finally {

            try {

                if (rset != null) {
                    rset.close();
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

    public Pessoa Login(String cpf, String senha) {
        String sql = "select * from cliente where cpf = ? and senha = ? ";
        PreparedStatement pstm = null;
        ResultSet rset = null;
        Pessoa p = new Pessoa();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cpf);
            pstm.setString(2, senha);
            rset = pstm.executeQuery();
            if (rset.next()) {
                p.setCpf(rset.getString("cpf"));
                p.setSenha(rset.getString("senha"));
                p.setEmail(rset.getString("email"));
                p.setNome(rset.getNString("nome"));
                p.setIdade(rset.getInt("idade"));
                p.setCelular(rset.getString("celular"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return p;
    }
}

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
import jdbc.ConnectBD;
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
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "select * from cliente";
        try {
            pstm = conn.prepareStatement(sql);
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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {

                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public void buscarCpf(Pessoa cliente) {
        try {

        } catch (Exception e) {
        }
    }
}

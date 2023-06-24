/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Factory.ConnectBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Assento;

/**
 *
 * @author jhenn
 */
public class AssentoDAO {

    private Connection conn;

    public AssentoDAO() {
        this.conn = new ConnectBD().getConnection();
    }

    public void cadastrar(Assento as) {
        try {
            String sql = "INSERT INTO  assentos (nrCadeira, status, cliente_cpf) VALUES (?,?,?)";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rset = null;
            pstm.setInt(1, as.getNrCadeira());
            pstm.setBoolean(2, as.getStatus());
            pstm.setString(3, as.getCpf());
            pstm.execute();
            pstm.close();

            System.out.println("Assento cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Assento não cadastrado. ERRO:::" + e);
        }
    }

    public void deletarAssento(int id) {
        String sql = "DELETE FROM assentos WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
            if (pstm.getUpdateCount() > 0) {
                JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível remover!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
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
    }

}

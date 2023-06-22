/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jdbc.ConnectBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pagamento;

/**
 *
 * @author jhenn
 */
public class PagamentoDAO {

    private Connection conn;

    public PagamentoDAO() {
        this.conn = new ConnectBD().getConnection();
    }

    public boolean PagamentoDAO(Pagamento pag) {

        String sql = "insert into pagamento(id, numCartao, cvv, nome, cpfCliente) values (null,?,?,?,?)";
        PreparedStatement psm = null;
        try {
            psm = conn.prepareStatement(sql);
                psm.setString(1, pag.getNumCartao());
                psm.setString(2, pag.getCvv());
                psm.setString(3, pag.getNomeCart());
                psm.setString(4, pag.getCpf());
            psm.execute();
            psm.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

}

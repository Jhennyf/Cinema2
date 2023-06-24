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
import java.util.ArrayList;
import java.util.List;
import model.Pagamento;
import model.Pessoa;

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
    
     public List<Pagamento> listarPagamento() {
  
        List<Pagamento> lista = new ArrayList<Pagamento>();
        String sql = "select * from pagamento";
        PreparedStatement psm = null;
        ResultSet rset = null;
       
        try {
            psm = conn.prepareStatement(sql);
            rset = psm.executeQuery();
            while (rset.next()) {
                Pagamento p = new Pagamento();

                p.setCpf(rset.getString("cpf"));
                p.setNumCartao(rset.getString("numCartao"));
                p.setCvv(rset.getString("Cvv"));
                p.setNomeCart(rset.getString("nomeCartao"));
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

}

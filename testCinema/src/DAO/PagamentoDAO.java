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
    public void PagamentoDAO(Pagamento pag) {
        try {
            String sql = "insert into pagamento(id, numCartao, cvv, nomeCartao, dataExp, dataPag, cpfCliente) "
                    + "values (?,?,?,?,?,?,?)";
            PreparedStatement psm = conn.prepareStatement(sql);
            
            
            psm.setString(1, pag.getNumCartao());
            psm.setInt(2,pag.getCvv());
            psm.setString(3, pag.getNomeCart());
            psm.setInt(4, pag.getDataExp());
            psm.setString(5, pag.getDataPag());
            psm.setString(6, pag.getCpf());   
            
            psm.execute();
            psm.close();
            
            System.out.println("Pagamento realizado com sucesso! ");
            System.out.println("Dados pagamento"+ pag.toString());
        } catch (Exception e) {
            System.out.println("Erro ao realizar pagamento" + e);
        }
    }
 
}

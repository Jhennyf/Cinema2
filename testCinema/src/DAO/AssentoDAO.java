/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import jdbc.ConnectBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            String sql = "INSERT INTO  assento (statusOcupado) VALUES (?)";
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rset = null;
            pstm.setBoolean(1, as.getStatus());
            
            pstm.execute();
            pstm.close();
            
            System.out.println("Assento cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Assento não cadastrado. ERRO:::" + e);
        }
    }
}
    

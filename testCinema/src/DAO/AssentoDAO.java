/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.AssentosCinema;
import jdbc.ConnectBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhenn
 */
public class AssentoDAO {
    
     private Connection conn;

    public AssentoDAO() {
        this.conn = new ConnectBD().getConnection();
    }
    
    public void cadastrar(AssentosCinema ac) {
        String sql = "INSERT INTO  assento (id, nDoAssento,horas,statusOcupado) VALUES (null,?,?,?)";
        PreparedStatement state = null;
        ResultSet rset = null;
        try {
            state = conn.prepareStatement(sql);
            state.setInt(1, ac.getnDoAssento());
            state.setDate(2, (Date) ac.getHoras());
            state.setBoolean(3, ac.getStatusOcupado());
            state.execute();
            state.close();
            System.out.println("Assento cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Assento não cadastrado. ERRO:::" + e);
        }
    }
    
}

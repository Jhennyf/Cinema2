/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.ConnectBD;
import model.Sessoes;

/**
 *
 * @author jhenn
 */
public class SessoesDAO {
     private Connection conn;
    
    public SessoesDAO() {
        this.conn = (Connection) new ConnectBD().getConnection(); 
    }
    
    public void cadastrar(Sessoes sessoes) throws SQLException {
        String sql = "insert into sessoes (id, horario, tipo, idFilme) values (?,?,?,?)";
        PreparedStatement psm = null;
         ResultSet rset = psm.executeQuery();
        
        try {
            psm = (PreparedStatement) conn.prepareStatement(sql);
            psm.setInt(1, sessoes.getIdSessoes());
            psm.setString(2, sessoes.getHorarios());
            psm.setString(3, sessoes.getTipo());
            psm.setInt(4, sessoes.getIdFilme());

            psm.execute();
            psm.close();

            System.out.println("Cadastrado! ");
        } catch (SQLException e) {
            System.out.println("Erro ao realizar cadastro. " +e);
        }
    }
}


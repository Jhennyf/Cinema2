/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.ConnectBD;
import model.Reserva;

/**
 *
 * @author jhenn
 */
public class ReservaDAO {
    private Connection conn;
    
    public ReservaDAO(){
    this.conn = new ConnectBD().getConnection();
    }
    
    public void cadastrar(Reserva reserva){
        try {
            String sql = "insert int reserva (cpfCliente, idSessao, nDoAssento) values (?, ?, ?,)";
            PreparedStatement psm = conn.prepareStatement(sql);
            psm.setString(1, reserva.getCpf());
            psm.setInt(2,reserva.getIdReserva());
            psm.setInt(3, reserva.getnDoAssento());
            
            psm.execute();
            psm.close();
            
            System.out.println("Cadastra de reserva concluido ");
        } catch (Exception e) {
            
            System.out.println("Erro ao realizar cadastro. " + e); 
        }
    
    }
    
    public Reserva buscar (int i){
        try {
            int id = i;
           String sql = "SELECT * FROM `reserva` WHERE id =  " + id;
           PreparedStatement psm = conn.prepareStatement(sql);
           ResultSet result = psm.executeQuery();
           Reserva r = new Reserva();
           
           if(result.next()){
           r.setIdReserva(result.getInt("id"));
           r.setCpf(result.getNString("cpfCliente"));
           r.setIdReserva(result.getInt("idReserva"));
           r.setnDoAssento(result.getInt("nDoAssento"));
           }
           return r;
        } catch (Exception e) {
            return null;
        }
    }
}

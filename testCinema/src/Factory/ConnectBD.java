/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;


import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author jhenn
 */
public class ConnectBD {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/cinema", "root", ""
                    + "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

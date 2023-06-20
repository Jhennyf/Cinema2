/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.SessoesDAO;
import java.sql.SQLException;
import model.Sessoes;

/**
 *
 * @author jhenn
 */
public class SessoesControler {
    
    public void cadastrar(Sessoes s) throws SQLException{
        
        SessoesDAO sDAO = new SessoesDAO();
        s.setIdSessoes(s.getIdSessoes());
        s.setHorarios(s.getHorarios());
        s.setTipo(s.getTipo());
        s.setIdFilme(s.getIdFilme());
        sDAO.cadastrar(s);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.AssentoDAO;
import model.Assento;
/**
 *
 * @author jhenn
 */
public class AssentoControler {
    
    public void cadastrar(Assento assento) {
        Assento as = new Assento();
        AssentoDAO aDAO = new AssentoDAO();
        as.setStatus(assento.getStatus());
        aDAO.cadastrar(as);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.AssentoDAO;
import model.AssentosCinema;

/**
 *
 * @author jhenn
 */
public class AssentoControler {
    
    public void cadastrar(AssentosCinema as) {
        AssentoDAO dao = new AssentoDAO();
        dao.cadastrar(as);
    }
}

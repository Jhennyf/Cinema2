/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.AdmDAO;
import model.ADM;
import model.Pessoa;

/**
 *
 * @author jhenn
 */
public class AdmControler {
    
    public void cadastrar(ADM adm){
        AdmDAO aDAO = new AdmDAO();
        adm.setNome(adm.getNome());
        adm.setSenha(adm.getSenha());
        aDAO.cadastrar(adm);
    }
    
    public boolean login(String nome, String senha){
        AdmDAO dao = new AdmDAO();
        return dao.Login(nome, senha)!= null;  
    }
}

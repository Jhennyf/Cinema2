/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.ClienteDAO;
import model.Pessoa;

/**
 *
 * @author jhenn
 */
public class ClienteControler {
    
    ClienteDAO cDAO = new ClienteDAO();
    
    public void cadastrar(Pessoa p){
        cDAO.cadastrar(p);
    }
    
    public Pessoa login(String cpf, String senha){
         return cDAO.Login(cpf, senha);
    }
}

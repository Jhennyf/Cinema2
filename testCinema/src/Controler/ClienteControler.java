/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.ClienteDAO;
import model.Pessoa;
import view.Cadastro;

/**
 *
 * @author jhenn
 */
public class ClienteControler {
    
    ClienteDAO cDAO = new ClienteDAO();
    
    public void cadastrar(Pessoa p){
        
        p.setCpf(p.getCpf());
        p.setNome(p.getNome());
        p.setEmail(p.getEmail());
        p.setIdade(p.getIdade());
        p.setCelular(p.getCelular());
        p.setSenha(p.getSenha());
        cDAO.cadastrar(p);
    }
    
    public boolean login(String cpf, String senha){
        return cDAO.Login(cpf, senha) != null;
    }
}

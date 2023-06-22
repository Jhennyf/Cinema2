/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.SessaoDAO;
import model.Sessao;

/**
 *
 * @author jhenn
 */
public class SessaoControler {
    
    public void cadastrar(Sessao sessao){
        Sessao s = new Sessao();
        SessaoDAO sDAO = new SessaoDAO();
        s.setId(sessao.getId());
        s.setHorario(sessao.getHorario());
        s.setTipo(sessao.getTipo());
        s.setIdFilme(sessao.getIdFilme());
        sDAO.cadastrar(s);     
    }  
    
    public Sessao buscar(int i){
    int id = i;
    Sessao r = new Sessao();
    SessaoDAO reservaDao = new SessaoDAO();
    r = reservaDao.buscar(id);
    return r;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.FilmeDAO;
import model.Filme;

/**
 *
 * @author jhenn
 */
public class FilmeControler {
    
    public void cadastrar(Filme filme) {
        FilmeDAO filmeDao = new FilmeDAO();
        filmeDao.cadastrar(filme);
    }
    
    public Filme buscar(int i) {
        int id = i;
        Filme f = new Filme();
        FilmeDAO filmeDao = new FilmeDAO();
        f = filmeDao.buscar(id);
        return f;
    }
}

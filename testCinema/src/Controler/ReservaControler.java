/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.ReservaDAO;
import model.Reserva;

/**
 *
 * @author jhenn
 */
public class ReservaControler {
    public void cadastrar(Reserva reserva){
    Reserva r = reserva;
    ReservaDAO reservaDao = new ReservaDAO();
    reservaDao.cadastrar(r);
    }
    
    public Reserva buscar(int i){
     int id = i;
    Reserva r = new Reserva();
    ReservaDAO reservaDao = new ReservaDAO();
    r = reservaDao.buscar(id);
    return r;
    }
}


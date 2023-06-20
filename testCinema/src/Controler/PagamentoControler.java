/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.PagamentoDAO;
import model.Pagamento;
import view.PagCinema;

/**
 *
 * @author jhenn
 */
public class PagamentoControler {

    public void compra(Pagamento pag) {
        PagamentoDAO pDAO = new PagamentoDAO();
        pDAO.PagamentoDAO(pag);
    }
}

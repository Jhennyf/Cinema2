/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import DAO.PagamentoDAO;
import java.sql.SQLException;
import model.Pagamento;

/**
 *
 * @author jhenn
 */
public class PagamentoControler {

    PagamentoDAO pDAO = new PagamentoDAO();
    
    public boolean compra(Pagamento pag) {
        return pDAO.PagamentoDAO(pag);
    }
}

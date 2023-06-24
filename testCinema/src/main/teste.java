/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import DAO.AssentoDAO;
import model.Assento;

/**
 *
 * @author jhenn
 */
public class teste {
        public static void main(String[] args) {
            AssentoDAO dao = new AssentoDAO();
            Assento as = new Assento(true, "70826312195", 1);
            dao.cadastrar(as);
        }
}

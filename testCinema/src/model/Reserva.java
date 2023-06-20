/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author Clarice
 */
public class Reserva extends Pessoa{
    
    private int idReserva;
    private int nDoAssento;
    
    public Reserva(){
    
    }

    public int getnDoAssento() {
        return nDoAssento;
    }

    public void setnDoAssento(int nDoAssento) {
        this.nDoAssento = nDoAssento;
    }
    
    public Reserva(String cpf) {
        super(cpf);
        this.idReserva = geraId(idReserva);
    }
    
    public int geraId(int idReserva){
        Random gerador = new Random();
        this.idReserva = gerador.nextInt(10000,90000);
        
        System.out.println("id da reserva: " + this.getIdReserva());
        return this.getIdReserva();
    }
    
    public int getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author jhenn
 */
public class Assento {

    private int id;
    private Boolean status;

    public Assento() {
    }

    public Assento(Boolean statusOcupado) {
        this.id = geraId(id);
        this.status = statusOcupado;
    }

    public int geraId(int idSessoes){
        Random gerador = new Random();
        this.id = gerador.nextInt(100,900);
        return this.getId();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssentosCinema{" + "id=" + id + " statusOcupado=" + status + '}';
    }

}

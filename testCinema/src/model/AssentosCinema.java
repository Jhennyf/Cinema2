/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author jhenn
 */
public class AssentosCinema {
    
    private Long id;
    private int nDoAssento;
    private Date horas;
    private Boolean statusOcupado;

    public AssentosCinema() {
    }

    public AssentosCinema(Long id, int nDoAssento, Date horas, Boolean statusOcupado) {
        this.id = id;
        this.nDoAssento = nDoAssento;
        this.horas = horas;
        this.statusOcupado = statusOcupado;
    }

    
    

//    public void mostra(){
//        System.out.println("Numero do assento: " + this.getnDoAssento()
//        + "\nstatus: " + this.isStatus());
//    }
    public AssentosCinema(int nDoAssento) {
        this.nDoAssento = nDoAssento;
    }

    public int getnDoAssento() {
        return nDoAssento;
    }

    public void setnDoAssento(int nDoAssento) {
        this.nDoAssento = nDoAssento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public Boolean getStatusOcupado() {
        return statusOcupado;
    }

    public void setStatusOcupado(Boolean statusOcupado) {
        this.statusOcupado = statusOcupado;
    }

    @Override
    public String toString() {
        return "AssentosCinema{" + "id=" + id + ", nDoAssento=" + nDoAssento + ", horas=" + horas + ", statusOcupado=" + statusOcupado + '}';
    }

   

   
}

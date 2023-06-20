/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author jhenn
 */
public class Sessoes extends Filme{

    private String horarios; // converter pra time 
    private String tipo;
    private String datas;
    private int idSessoes;
    
    public Sessoes (String horarios, String tipo, String datas, int idFilme) {
        super(idFilme);
        this.idSessoes = geraId(idSessoes);
        this.horarios = horarios;
        this.tipo = tipo;
        this.datas = datas;
    }  
    
    public int geraId(int idSessoes){
        Random gerador = new Random();
        this.idSessoes = gerador.nextInt(100,900);
        
        System.out.println("id da sessão é: " + this.getIdSessoes());
        return this.getIdSessoes();
    }
    
    public Sessoes(int idSessoes, int idFilme){
        super(idFilme);
        this.idSessoes = geraId(idSessoes);
    }

    public int getIdSessoes() {
        return idSessoes;
    }
    public void setIdSessoes(int idSessoes) {
        this.idSessoes = idSessoes;
    }

    public String getHorarios() {
        return horarios;
    }
    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDatas() {
        return datas;
    }
    public void setDatas(String datas) {
        this.datas = datas;
    }
}

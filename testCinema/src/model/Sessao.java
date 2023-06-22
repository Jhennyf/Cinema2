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
public class Sessao extends Filme{

    private String horario;
    private String tipo;
    private int id;
    
    public Sessao() {
    }

    public Sessao(String horario, String tipo, int idFilme) {
        super(idFilme);
        this.id = geraId(id);
        this.horario = horario;
        this.tipo = tipo;
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

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhenn
 */
public class Assento {

    private int id;
    private int nrCadeira;
    private Boolean status;
    private String cpf;

    public Assento() {
    }

    /**
     *
     * @param statusOcupado
     * @param cpf
     * @param nrCadeira
     */
    public Assento(Boolean statusOcupado, String cpf, int nrCadeira) {
        this.status = statusOcupado;
        this.cpf = cpf;
        this.nrCadeira = nrCadeira;
    }
    
     public int getNrCadeira() {
        return nrCadeira;
    }

    public void setNrCadeira(int nrCadeira) {
        this.nrCadeira = nrCadeira;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Assento{" + "id=" + id + ", nrCadeira=" + nrCadeira + ", status=" + status + ", cpf=" + cpf + '}';
    }
    
    
}

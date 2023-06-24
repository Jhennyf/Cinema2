/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.UtilView.TelaAssento;


/**
 *
 * @author jhenn
 */
public class Pagamento {
   
   
    private String numCartao;
    private String cvv;
    private String nomeCart;
    private String cpf;  
    
    public Pagamento(){}

    public Pagamento(String numCartao, String cvv, String nomeCart, String cpf) {
        this.numCartao = numCartao;
        this.cvv = cvv;
        this.nomeCart = nomeCart;
        this.cpf = cpf;
        
    }

    public Pagamento(TelaAssento aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    /*public int geraId(int idPagamento){
        Random gerador = new Random();
        this.idPagamento = gerador.nextInt(1000,9000);
        
        System.out.println("id do pagamento: " + this.getIdPagamento());
        return this.getIdPagamento();
    }*/
    
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNomeCart() {
        return nomeCart;
    }

    public void setNomeCart(String nomeCart) {
        this.nomeCart = nomeCart;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

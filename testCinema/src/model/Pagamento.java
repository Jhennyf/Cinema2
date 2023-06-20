/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jhenn
 */
public class Pagamento extends Pessoa {

    private String numCartao;
    private int idPagamento;
    private int cvv;
    private int dataExp;
    private String nomeCart;
    private String dataPag;

    public Pagamento(String cpf, String numCartao, int cvv, String nomeCart, int dataExp, String dataPag) {
        super(cpf);
        this.idPagamento = geraId(idPagamento);
        this.numCartao = verifNumCart(numCartao);
        this.cvv = verifCvv(cvv);
        this.nomeCart = nomeCart;
        this.dataExp = verifDataExp(dataExp);
        this.dataPag = dataPag;
    }

    public Pagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int geraId(int idPagamento){
        Random gerador = new Random();
        this.idPagamento = gerador.nextInt(1000,9000);
        
        System.out.println("id do pagamento: " + this.getIdPagamento());
        return this.getIdPagamento();
    }
    
    public String verifNumCart(String numCartao) {
        try {
            if (numCartao.length() != 16) {
                throw new IllegalArgumentException("O número do cartão deve conter 16 dígitos");
            } else if (!numCartao.matches(".*\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d.*")) {
                throw new IllegalArgumentException("O número do cartão deve conter dígitos númericos");
            } else {
                this.numCartao = numCartao;
            }
            System.out.println("Número do Cartão cadastrado com sucesso: " + this.getNumCartao());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "NÚMERO DE CARTÃO INVÁLIDO", JOptionPane.ERROR_MESSAGE);
        }
        return this.getNumCartao();
    }

    public int verifCvv(int cvv) {
        try {
            if (cvv < 99 || cvv > 999) {
                throw new IllegalArgumentException("O cvv do cartão deve conter 3 dígitos");
            } else {
                this.cvv = cvv;
            }
            System.out.println("Cvv cadastrado com sucesso: " + this.getCvv());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "NÚMERO DE CVC INVÁLIDO", JOptionPane.ERROR_MESSAGE);
        }
        return this.getCvv();
    }

    public int verifDataExp(int dataExp) {
        try {
            if (dataExp < 2023) {
                throw new IllegalArgumentException("A data de expedição não pode ser menor que o ano atual");
            } else {
                this.dataExp = dataExp;
            }
            System.out.println("Data de Expedição cadastrada com sucesso: " + this.getDataExp());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "DATA DE EXPEDIÇÃO INVÁLIDA", JOptionPane.ERROR_MESSAGE);
        }
        return this.getDataExp();
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getNomeCart() {
        return nomeCart;
    }

    public void setNomeCart(String nomeCart) {
        this.nomeCart = nomeCart;
    }

    public int getDataExp() {
        return dataExp;
    }

    public void setDataExp(int dataExp) {
        this.dataExp = dataExp;
    }

    public String getDataPag() {
        return dataPag;
    }

    public void setDataPag(String dataPag) {
        this.dataPag = dataPag;
    }
}

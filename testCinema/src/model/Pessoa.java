/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Pessoa implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String nome;
    private int idade;
    private String celular;
    private String email;
    private String cpf;
    private String senha;

    public Pessoa() {
        
    }

    /**
     *
     * @param email
     * @param nome
     * @param idade
     * @param celular
     * @param cpf
     * @param senha
     */
    public Pessoa(String cpf, String senha, String email, String nome, int idade, String celular) {
        super();
        this.cpf = (verifCpf(cpf));
        this.senha = (verifSenha(senha));
        this.email = (verifEmail(email));
        this.nome = (verifNome(nome));     
        this.idade = (verifIdade(idade));
        this.celular = (verifCelular(celular));    }

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String verifNome(String nome) {
        try {
            if ((nome.length() < 3) || (nome.length() > 20)) {
                throw new IllegalArgumentException("Nome inválido. Minimo 3 caracteres, "
                        + "\nmáximo 20 caracteres");
            } else {
                this.nome = nome;
            }
            System.out.println("Nome cadastrado com sucesso: " + this.getNome());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "NOME INVÁLIDO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return nome;
    }

    public int verifIdade(int idade) {
        try {
            //verifica se a idade não é menor que 0
            if (idade <= 0) {
                throw new IllegalArgumentException("A idade deve ser maior que 0");
            }else{
                this.idade = idade;
            }
            System.out.println("Idade cadastrada com sucesso: " + this.getIdade());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "IDADE INVÁLIDA", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return idade;
    }

    public String verifCelular(String celular) {
        try {
            //verifica a quantidade de digitos do celular
            if (celular.length() != 11) {
                throw new IllegalArgumentException("O número de celular deve conter 11 dígitos");
            }
            else if(!celular.matches(".*\\d.*")){
                throw new IllegalArgumentException("O número de celular deve conter apenas números");
            }else{
                this.celular = celular;
            }
            System.out.println("Celular cadastrado com sucesso: " + this.getCelular());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "CELULAR INVÁLIDO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return celular;
    }
    
    public String verifEmail(String email){
        try{
            if(!email.matches(".*@gmail.com*.")){
                throw new IllegalArgumentException("O email deve conter @gmail.com");  
            }else{
                this.email = email;
            }
            System.out.println("Email cadastrado com sucesso: " + this.getEmail());
        }catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "CELULAR INVÁLIDO", 
                    JOptionPane.ERROR_MESSAGE);
    }       
        return email;
    }

    public String verifCpf(String cpf) {
        try {
            //verifica a quantidade de digitos do CPF
            if (cpf.length() != 11) {
                throw new IllegalArgumentException("O CPF deve conter 11 dígitos");
            }
            //Verifica por meio do método cpfValido a validaçao do cpf
            if (!cpf.matches(".*\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d.*")) {
                throw new IllegalArgumentException("O CPF deve conter apenas números");
            }else{
                this.cpf = cpf;
            }
            System.out.println("Cpf cadastrado com sucesso: " + this.getCpf());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "CPF INVÁLIDO", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return cpf;
    }

    public String verifSenha(String senha) {
        try {
            //verifica se a senha não atingiu o minimo de 8 caracteres
            if (senha.length() < 8) {
                throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
            }
            //verifica se a senha não excedeu o limite de 15 caracteres
            if (senha.length() > 15) {
                throw new IllegalArgumentException("A senha excedeu o limite de 20 caracteres.");
            }
            // Verifica se a senha contém letras minúsculas
            if (!senha.matches(".*[a-z].*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos uma letra minúscula.");
            }
            // Verifica se a senha contém números
            if (!senha.matches(".*\\d.*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos um número.");
            }     // Verifica se a senha contém caracteres especiais
            if (!senha.matches(".*[!@#$%&*_+=|(){}\\[\\]<>?/\\\\].*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos um caractere especial.");
            }
            else{
                this.senha = senha;
            }
            System.out.println("Senha cadastrada com sucesso: " + this.getSenha());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "SENHA INVÁLIDA", 
                    JOptionPane.ERROR_MESSAGE);
        }
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Kevin
 */
public class Candidato {
    private int id_inscricao;
    private long cpf;
    private String cpf_salvo;
    private String nome,email;
    private boolean verificaPagamento;

    public Candidato(){
        
    }
    public Candidato(long cpf, String nome, String email,String cpf_salvo) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.cpf_salvo = cpf_salvo;
    }
    
    public Candidato(long cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getId_inscricao() {
        return id_inscricao;
    }

    public void setId_inscricao(int id_inscricao) {
        this.id_inscricao = id_inscricao;
    }

    public boolean getVerificaPagamento() {
        return verificaPagamento;
    }

    public void setVerificaPagamento(boolean verificaPagamento) {
        this.verificaPagamento = verificaPagamento;
    }

    public String getCpf_salvo() {
        return cpf_salvo;
    }

    public void setCpf_salvo(String cpf_salvo) {
        this.cpf_salvo = cpf_salvo;
    }
    
}

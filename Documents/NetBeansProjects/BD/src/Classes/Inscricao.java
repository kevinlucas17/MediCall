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
public class Inscricao {
    private int codigo;
    private boolean verificaPagamento;

    public Inscricao(int codigo, boolean verificaPagamento) {
        this.codigo = codigo;
        this.verificaPagamento = verificaPagamento;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isVerificaPagamento() {
        return verificaPagamento;
    }

    public void setVerificaPagamento(boolean verificaPagamento) {
        this.verificaPagamento = verificaPagamento;
    }
    
}

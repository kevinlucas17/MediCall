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

public class ValidacaoEntradas {
    
    public boolean validaNome(String nome){
        return nome.matches("^(([A-Z]{2,30})\\s*){2,10}");
    }
    public boolean validaRG(String rg){
        return rg.matches("(([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2}))");
    }
    public boolean validaCel(String cel){
        return true ;
       /*cel.matches("(([0-9]{5})([0-9]{4}))")*/
    }
    public boolean validaTel(String tel){
        return true/*tel.matches("(([0-9]{4})([0-9]{4}))");*/;
    }
    public boolean validaDataNascimento(String data){
        return data.matches("\\d{2}/\\d{2}/\\d{2,4}");
    }
    
}

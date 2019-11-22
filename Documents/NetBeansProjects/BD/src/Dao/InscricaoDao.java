
package Dao;

import Banco.AcessoBanco;
import Classes.Inscricao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class InscricaoDao {
    private final AcessoBanco acessoBanco = new AcessoBanco(); 
    private Connection conexao = acessoBanco.conector();
    private PreparedStatement pst;    
    private ResultSet rs;
    private Statement state;    
    
    public boolean realizaInscricao(){
        try{
            pst = conexao.prepareStatement("insert into tbl_inscricao() values()");
              pst.execute();
              pst.close();
              return true;
        }catch(SQLException e){
            System.out.println(e+" realizaoinscricao");
            return false;
        }
    }    
    public boolean pagar(Inscricao inscricao){
        try{
            pst = conexao.prepareStatement("update tbl_inscricao set verifica_pagamento=? where codigo=?");
            pst.setString(0,String.valueOf(true));
            pst.setString(1, String.valueOf(inscricao.getCodigo()));
            pst.executeUpdate();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+"pagar");
            return false;
        }
    }
   
    public ResultSet recuperaInscricao(){
        
        try{
            pst = conexao.prepareStatement("select * from tbl_inscricao");
            rs = pst.executeQuery();
            return rs;
        }catch(SQLException e){
            System.out.println(e+" recuperainscricao");
            return null;
        }
    }
     public String recebeUltimo(){
        try{
            pst = conexao.prepareStatement("select count(id_inscricao) from tbl_candidato");            
            rs = pst.executeQuery();      
          return rs.getString(1);
        }catch(SQLException e){
            System.out.println(e+" recebeultimo");
            return null;
        }
    } 
    public boolean verificaPagamento(int c){
        return true;
    }
}

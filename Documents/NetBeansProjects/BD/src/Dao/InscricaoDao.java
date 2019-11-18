
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
    
    public boolean realizaInscricao(int codigo){
        try{
            pst = conexao.prepareStatement("insert into tbl_inscricao() values()");
              pst.execute();
              return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }    
    public boolean pagar(Inscricao inscricao){
        try{
            pst = conexao.prepareStatement("update tbl_inscricao set verifica_pagamento=? where codigo=?");
            pst.setString(0,String.valueOf(true));
            pst.setString(1, String.valueOf(inscricao.getCodigo()));
            return pst.execute();
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
   
    public ResultSet recuperaInscricao(){
        
        try{
            pst = conexao.prepareStatement("select * from tbl_inscricao");
            rs = pst.executeQuery();
            return rs;
        }catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
}

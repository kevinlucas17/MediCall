
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
    public boolean pagar(String id){
        try{
            pst = conexao.prepareStatement("update tbl_inscricao set verifica_pagamento=? where id_inscricao=?");
            pst.setString(1, "1");
            pst.setString(2, String.valueOf(id));
            pst.executeUpdate();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+" pagar");
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
     public ResultSet recebeUltimo(){
        try{
            pst = conexao.prepareStatement("select count(id_inscricao) from tbl_inscricao");            
            rs = pst.executeQuery();      
          return rs;
        }catch(SQLException e){
            System.out.println(e+" recebeultimo");
            return null;
        }
    } 
    public boolean verificaPagamento(String c){
        try{
            pst = conexao.prepareStatement("select verifica_pagamento from tbl_inscricao where id_inscricao =?");
            pst.setString(1,c);
            rs =pst.executeQuery();
            while(rs.next()){
                if(!"0".equals(rs.getString(1))){
                    return true;                
                }else{
                    return false;        
                }
            }           
    
        }catch(SQLException e){
            System.out.println(e+" verifica pagamento");
            return false;
        }
        return false;
    }
    
    public boolean removeInscricao(String id){
        try{
            pst = conexao.prepareStatement("delete from tbl_inscricao where id_inscricao=?");
            pst.setString(1,id);
            pst.execute();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+" remove inscricao");
            return false;
        }
    }
   
}

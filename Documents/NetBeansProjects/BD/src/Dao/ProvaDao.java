/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Banco.AcessoBanco;
import Classes.Prova;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin
 */
public class ProvaDao {
    private final AcessoBanco acessoBanco = new AcessoBanco(); 
    private Connection conexao = acessoBanco.conector();
    private PreparedStatement pst;
    private Prova prova;
    private ResultSet rs;
    private Statement state;
    
    /*public ResultSet consulta(){
        
    }*/
    public ProvaDao(){
        prova = new Prova();
    }
    
    public boolean insereQuali(Prova prova){
       
        try{
            pst = conexao.prepareStatement("insert into tbl_prova(nota_qualificacao,nota_discursiva)values(?,?)");
            pst.setString(1,String.valueOf(prova.getNotaQualificacao()));
            pst.setString(1,String.valueOf(prova.getNotaDiscursiva()));
            pst.executeUpdate();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+" inserequali");
            return false;
        }     
    }
    public ResultSet recuperaProva(int id_prova){
        try{
            pst = conexao.prepareStatement("select * from tbl_prova where id_prova=?");
            pst.setString(1, String.valueOf(id_prova));
            rs =pst.executeQuery();              
                   
            return rs;
            
        }catch(SQLException e){
            System.out.println(e+" recuperaprova");
            return null;
        }
    }    
    
    public ResultSet recuperaProva(){
        try{
            pst = conexao.prepareStatement("select * from tbl_prova");
            rs =pst.executeQuery();          
                   
            return rs;
            
        }catch(SQLException e){
            System.out.println(e+" recuperaprova");
            return null;
        }
    }
    public boolean insereDisc(Prova prova){
       
        try{
            pst = conexao.prepareStatement("insert into tbl_prova(nota_qualificacao,nota_discursiva)values(?,?)");
            pst.setString(1,String.valueOf(prova.getNotaQualificacao()));
            pst.setString(1,String.valueOf(prova.getNotaDiscursiva()));
            pst.executeUpdate();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+"inseredisc");
            return false;
        }     
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Banco.AcessoBanco;
import Classes.Candidato;
import Classes.Prova;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kevin
 */
public class TblFazProvaDao {
    private final AcessoBanco acessoBanco = new AcessoBanco(); 
    private final Connection conexao = acessoBanco.conector();
    private PreparedStatement pst;
    private ResultSet rs;
    
    public boolean associaProva(Candidato candidato,Prova prova){
        try{
            pst = conexao.prepareStatement("insert into tbl_faz_prova(cpf,id_prova) values (?,?)");
            pst.setString(1,String.valueOf(candidato.getCpf()));
            pst.setString(2, prova.getId());            
            pst.executeUpdate();
            pst.close();
            return true;
        }catch(SQLException e){
            System.out.println(e+" associa prova");
            return false;
        }
        
    }    
    
    public ResultSet consultaCpf(String cpf){
       try{
           pst = conexao.prepareStatement("select * from tbl_faz_prova where cpf =?");
           pst.setString(1,cpf);
           rs =pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e+" consultaCpf");
           return null;
       }
    }
    /*
    public int coonsultaCpfId(long cpf, int id){
        return 1;
    }
   */
    public int retornaLinhas(String cpf){
        int k = 0 ;
        try{
        pst = conexao.prepareStatement("select count(*) from tbl_faz_prova where cpf = ?");
        pst.setString(1,cpf);
        rs = pst.executeQuery();
        while(rs.next()){
            k = Integer.parseInt(rs.getString(1));
        }        
        return k;
        }catch(SQLException e){
            System.out.println(e+" retorna linha");
            return -1;
            
        }
    }
}

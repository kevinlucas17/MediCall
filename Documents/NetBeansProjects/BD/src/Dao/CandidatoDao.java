package Dao;

import Banco.AcessoBanco;
import Classes.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CandidatoDao {
   private final AcessoBanco acessoBanco= new AcessoBanco();
   private Connection conexao = acessoBanco.conector();
   private Candidato candidato;
   private PreparedStatement pst;
   private ResultSet rs;
   private Statement state;  
   
   public CandidatoDao(){
       candidato = new Candidato();
   }
   
   public boolean salvarCandidato(Candidato candidato){
       
       try{
       pst = conexao.prepareStatement("insert into tbl_candidato(cpf,nome,email) values(?,?,?)");
       pst.setString(1,String.valueOf(candidato.getCpf()));
       pst.setString(2,String.valueOf(candidato.getNome()));
       pst.setString(3,candidato.getEmail());
       pst.executeUpdate();
       return true;
       }catch(SQLException e){
           System.out.println(e+" salvarcandidato");
           return false;     
       }         
     
   }    
   
   public ResultSet recuperaCandidato(String nome){
       try{           
           pst = conexao.prepareStatement("select * from tbl_candidato where nome like ?");
           pst.setString(1, nome+"%");
           rs = pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e+" recuperacandidato");
           return null;
       }              
       
   } 
    
   
    public ResultSet recuperaCandidato(){
       try{
           pst = conexao.prepareStatement("select * from tbl_candidato order by id_inscricao");
           rs = pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e+" recuperacandidato");
           return null;
       }              
       
   }    
    public ResultSet recuperaCandidatoId(String id){
       try{           
           pst = conexao.prepareStatement("select * from tbl_candidato where id_inscricao=?");
           pst.setString(1,id);
           rs = pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e+" recuperacandidato cpf");
           return null;
       }              
       
   }
    
    public ResultSet recuperaCandidatoCpf(String cpf){
       try{           
           pst = conexao.prepareStatement("select * from tbl_candidato where cpf = ?");
           pst.setString(1, cpf);
           rs = pst.executeQuery();            
           return rs;
       }catch(SQLException e){
           System.out.println(e+" recuperacandidato");
           return null;
       }              
       
   }
    
   public boolean atribuiCandidatoInscricao(String id, String cpf){
       try{
          pst = conexao.prepareStatement("update tbl_candidato set id_inscricao = ? where cpf = ?");
          pst.setString(1,id);
          pst.setString(2,cpf);
          pst.executeUpdate();
          return true;
       }catch(SQLException e){
           System.out.println(e+"atribuicandidato");
           return false;
       }      
       
   }
   
   public boolean removeCandidato(String cpf){
       try{
       pst = conexao.prepareStatement("delete from tbl_candidato where cpf =?");
       pst.setString(1, cpf);
       pst.executeUpdate();
       pst.close();
       return true;
       }catch(SQLException e){
           System.out.println(e+" remover candidato");
           return false;
       }       
       
   }
   public boolean atualizaCandidato(Candidato candidato){
       try{
           pst = conexao.prepareStatement("update tbl_candidato set cpf =?, nome = ?, email =? where cpf =?");
           pst.setString(1, String.valueOf(candidato.getCpf()));
           pst.setString(2, candidato.getNome());
           pst.setString(3,candidato.getEmail());
           pst.setString(4, candidato.getCpf_salvo());
           pst.executeUpdate();
           pst.close();
           return true;
       }catch(SQLException e){
           System.out.println(e+" atualiza candidato");
           return false;
       }
       
   }
   
   public boolean verificaInscricao(String cpf){
       try{
        pst = conexao.prepareStatement("select id_inscricao from tbl_candidato where cpf=?");
        pst.setString(1,cpf);
        rs = pst.executeQuery();
        while(rs.next()){
            if(rs.getString(1) == null){
                return true;
            }else{
                return false;
            }
        }
        
       }catch(SQLException e){
           System.out.println(e+"verifica Inscricao");
           return false;
       }
       return false;
   }
  
}

package Banco;

import java.sql.*;



/**
 *
 * @author Kevin
 */
public class AcessoBanco {
     private java.sql.Connection conexao = null;
     public Connection conector(){        
        String driver = "com.mysql.jdbc.Driver"; 
        String url ="jdbc:mysql://localhost:3306/vestibular"; 
        String user = "root";
        String password = "";        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao conectar: "+e);
            return null;
            
        }
        
    }
     public boolean desconectar(){
         try{
            if(this.conexao.isClosed() ==false){
             this.conexao.close();
             return true;
            }            
        }catch(SQLException e){
             System.out.println("Erro ao desconectar: "+e); 
        }
        return false; 
     }
}


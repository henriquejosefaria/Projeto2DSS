package Funcionalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzon
 */
public class UtilizadorDAO {
    
    public UtilizadorDAO(){
        
    }
    
    public void addUtilizador(Integer id, String nome,String pass,String tipo) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO utilizador (idUtilizador, Nome, Password, Tipo)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, nome);
            pst.setString(3, pass);
            pst.setString(4, tipo);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! User not inserted!");
        }
    }
    
    public void removeUtilizador(Integer id) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("DELETE FROM utilizador WHERE idUtilizador = "+id);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Utilizador not Deleted!");
        }
    }
    
    public Utilizador getUtilizador(Integer id) throws SQLException{
        Connection con = AConnection.createConnection();
        Utilizador user = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM utilizador WHERE idUtilizador = "+id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            if(rs.getString(4).equals("A")){
                user = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
            if(rs.getString(4).equals("S")){
                user = new FuncionarioStand(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
            if(rs.getString(4).equals("F")){
                user = new FuncionarioFabrica(rs.getInt(1),rs.getString(2),rs.getString(3));
                }
            }
        AConnection.closeConection(con);
        return user;
    }
    
    public boolean containsUtilizador(Integer id) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM utilizador WHERE idEncomenda = "+id);
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
}

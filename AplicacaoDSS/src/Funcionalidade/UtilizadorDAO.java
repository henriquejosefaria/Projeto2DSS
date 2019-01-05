package Funcionalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

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
    
    public void addUtilizador(String nome,String pass,String tipo) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO Utilizador (Nome, Password, Tipo) VALUES ('"+nome+"','"+pass+"','"+tipo+"');";
            PreparedStatement pst = con.prepareStatement(query);
            //pst.setString(2, nome);
            //pst.setString(3, pass);
            //pst.setString(4, tipo);
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
            PreparedStatement pst = con.prepareStatement("DELETE FROM Utilizador WHERE idUtilizador = "+id+";");
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
        PreparedStatement pst = con.prepareStatement("SELECT * FROM Utilizador WHERE idUtilizador = "+id+";");
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
    
    public List<Integer> getAllIdsUtilizadores() throws SQLException{
        List <Integer> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT * FROM Utilizador");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            list.add(rs.getInt(1));
        }
        AConnection.closeConection(con);
        }
        return list;
    }
    
    public boolean containsUtilizador(Integer id) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM Utilizador WHERE idUtilizador = "+id+";");
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
}

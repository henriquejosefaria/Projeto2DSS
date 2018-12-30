package Funcionalidade;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class EncomendaDAO {
    
    public EncomendaDAO(){
        
    }
    
    public void addEncomenda(Encomenda enc) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO encomenda (idEncomenda, Data, Estado, Configuracao_idConfiguracao)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, enc.getId());
            pst.setString(2, enc.getData());
            pst.setInt(3, enc.getEstado());
            pst.setInt(4, enc.getConfigId());
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Encomenda not inserted!");
        }
    }
    
    public void removeEncomenda(Integer id) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("DELETE FROM encomenda WHERE idEncomenda = "+id);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! encomenda not Deleted!");
        }
    }
    public Encomenda getEncomenda(Integer id) throws SQLException{
        Connection con = AConnection.createConnection();
        Encomenda encomenda = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM encomenda WHERE idEncomenda = "+id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            encomenda = new Encomenda(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
        }
        AConnection.closeConection(con);
        return encomenda;
    }
    
    public boolean containsEncomenda(Integer id) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM encomenda WHERE idEncomenda = "+id);
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
}

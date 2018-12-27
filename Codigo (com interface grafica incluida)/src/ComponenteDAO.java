
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
public class ComponenteDAO {
    
    public ComponenteDAO(){
        
    }
    
    public void addComponente(String nome,Integer stock,Double preco, String descricao) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO componente (Nome, Stock, Tipo, Preco, Descricao)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nome);
            pst.setInt(2, stock);
            pst.setDouble(3, preco);
            pst.setString(4, descricao);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Componente not inserted!");
        }
    }
    
    public void romeveComponente(String nome) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("DELETE FROM componente WHERE Nome = "+nome);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Componente not Removed!");
        }
    }
    
    public Componente getComponente(String comp) throws SQLException{
        Connection con = AConnection.createConnection();
        Componente componente = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Nome = "+comp);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
        }
        AConnection.closeConection(con);
        return componente;
    }
    
    public boolean containsComponente(String nome) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM componente WHERE Nome = "+nome);
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
}

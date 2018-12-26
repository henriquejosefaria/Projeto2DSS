
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
public class PacoteDAO {
    public void addPacote(String nome, Integer configId) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO pacote (Nome, Configuracao_idConfiguracao)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, nome);
            pst.setInt(2, configId);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Pacote not inserted!");
        }
    }
    
    public void removePacote(String nome) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("DELETE FROM pacote WHERE Nome = "+nome);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Pacote not Removed!");
        }
    }
    
    public Pacote getPacote(String nome) throws SQLException{
        Connection con = AConnection.createConnection();
        Pacote pacote = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM pacote WHERE Nome = "+nome);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            pacote = new Pacote(rs.getString(1),rs.getInt(2));
        }
        AConnection.closeConection(con);
        return pacote;
    }
    
    public boolean containsPacote(String nome) throws SQLException{
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
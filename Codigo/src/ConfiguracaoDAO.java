
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
public class ConfiguracaoDAO {
    
    public ConfiguracaoDAO(){
        
    }
    
    public void addConfiguracao(Integer id, String nomeCliente,String modelo,String data) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO configuracao (Nome,Stock,Preco,Descricao)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, nomeCliente);
            pst.setString(3, modelo);
            pst.setString(4, data);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Configuracao not inserted!");
        }
    }
    
    public void removeConfiguracao(Integer id) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("DELETE FROM configuracao WHERE idConfiguracao = "+id);
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Configuracao not Deleted!");
        }
    }
    public Configuracao getConfiguracao(Integer id) throws SQLException{
        Connection con = AConnection.createConnection();
        Configuracao config = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM configuracao WHERE idConfiguracao = "+id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            config = new Configuracao(rs.getInt(1),rs.getString(2),null,rs.getString(3),rs.getString(4));
        
            PreparedStatement pst2 = con.prepareStatement("SELECT * FROM configuracao_has_componente WHERE Configuracao_idConfiguracao = "+id);
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
                String NComp = (rs2.getString(2));
                config.addComponente(NComp);
            }
        }
        AConnection.closeConection(con);
        return config;
    }
    
    public boolean containsConfiguracao(Integer id) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM configuracao WHERE idConfiguracao = "+id);
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
}

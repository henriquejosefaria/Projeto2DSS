package Funcionalidade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    

    public void addConfiguracao(Configuracao config) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "INSERT INTO Configuracao ( nome, nContribuinte, Modelo, Data,preco,Estado) VALUES (?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);

            pst.setString(1, config.getNome());
            pst.setInt(2, config.getNContribuinte());
            pst.setString(3, "Audi");
            pst.setString(4, config.getData());
            pst.setDouble(5, config.getPreco());
            pst.setString(6, "A");
            pst.execute();
            
            ResultSet rs = pst.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            config.setId(generatedKey);
            String query2 = "INSERT INTO Configuracao_has_Componentes ( Configuracao_idConfiguracao, Componentes_Nome) VALUES (?,?);";
            PreparedStatement pst2 = con.prepareStatement(query2);
        
            for(Componente c : config.getComponentes()){
                pst2.setInt(1, generatedKey);
                pst2.setString(2, c.getNome());
                pst2.execute();
            }
      
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Configuracao not inserted!");
        }
    }
    
    public void removeConfiguracao(Integer id) throws SQLException{
        
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("UPDATE Configuracao SET Estado = 'I' WHERE idConfiguracao = "+id+";");
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
        PreparedStatement pst = con.prepareStatement("SELECT * FROM Configuracao WHERE idConfiguracao = "+id+";");
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            config = new Configuracao(rs.getInt(1),rs.getString(2),rs.getInt(3),new ArrayList<Componente>(),rs.getString(4),rs.getDouble(6),rs.getString(5),rs.getString(7));
        
            PreparedStatement pst2 = con.prepareStatement("SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao,comp.Imagem From "
            + "Configuracao_has_Componentes as cc inner join Componente as comp on cc.Componentes_Nome = comp.Nome "
            + "WHERE cc.Configuracao_idConfiguracao = "+id+";");
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
                Componente comp = new Componente(rs2.getString(1),rs2.getInt(2),rs2.getString(3),rs2.getDouble(4),rs2.getString(5),rs2.getString(6));
                config.addComponente(comp);
            }
        }
        AConnection.closeConection(con);
        return config;
    }
    
    public List<Configuracao> getConfiguracoesAtivas(Integer nContribuinte) throws SQLException{
        List<Configuracao> config = new ArrayList<>();
        Configuracao conf;
        Connection con = AConnection.createConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM Configuracao WHERE nContribuinte = " + nContribuinte+";");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            conf = new Configuracao(rs.getInt(1),rs.getString(2),rs.getInt(3),new ArrayList<Componente>(),rs.getString(4),rs.getDouble(6),rs.getString(5),rs.getString(7));
            if(rs.getString(7).equals("A")){
                
            
            PreparedStatement pst2 = con.prepareStatement("SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao,comp.Imagem From Configuracao as c "
            +"inner join Configuracao_has_Componentes as cc on c.idConfiguracao = cc.Configuracao_idConfiguracao "
            +"inner join Componente as comp on cc.Componentes_Nome = comp.Nome "
            +"WHERE c.nContribuinte = "+nContribuinte+";");
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
                Componente comp = new Componente(rs2.getString(1),rs2.getInt(2),rs2.getString(3),rs2.getDouble(4),rs2.getString(5),rs2.getString(6));
                conf.addComponente(comp);
            }
            config.add(conf);
            }
        }
        AConnection.closeConection(con);
        return config;
    }
    
   /* public List<Configuracao> getConfiguracoes() throws SQLException{
        List<Configuracao> config = new ArrayList<>();
        Configuracao conf;
        Connection con = AConnection.createConnection();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM configuracao");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            conf = new Configuracao(rs.getInt(1),rs.getString(2),rs.getInt(3),new ArrayList<Componente>(),rs.getString(4),rs.getDouble(6),rs.getString(5));
        
            PreparedStatement pst2 = con.prepareStatement("SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao,comp.Imagem From Configuracao_has_componentes as cc "
            +"inner join Componente as comp on cc.Componentes_Nome = comp.Nome ");
            //+"WHERE c.nContribuinte = "+nContribuinte+";"); "+rs.getInt(1));
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
                Componente comp = new Componente(rs2.getString(1),rs2.getInt(2),rs2.getString(3),rs2.getDouble(4),rs2.getString(5),rs2.getString(6));
                conf.addComponente(comp);
            }
            config.add(conf);
        }
        AConnection.closeConection(con);
        return config;
    }*/
    
    public boolean containsConfiguracao(Integer id) throws SQLException{
            boolean res = false;
            Connection con = AConnection.createConnection();
            if(con!=null){
                PreparedStatement pst = con.prepareStatement("SELECT* FROM Configuracao WHERE idConfiguracao = "+id);
                ResultSet rs = pst.executeQuery();
                res = rs.next();
                AConnection.closeConection(con);
            }
            return res;
    }   
    
    public List<Componente> getComponentes(Integer id) throws SQLException{
        List<Componente> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT comp.Nome,comp.Stock,comp.Tipo,comp.Preco,comp.Descricao,comp.Imagem From " 
                    + "Configuracao_has_Componentes as cc "
                    + "inner join Componente as comp on cc.Componentes_Nome = comp.Nome " 
                    + "where cc.Configuracao_idConfiguracao = '"+id+"';");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Componente comp = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
                list.add(comp);
            }
            AConnection.closeConection(con);
        }
        return list;
    }
    
    public void decrementaStockConfig(Integer configID) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("UPDATE Componente as comp " +
            "inner join Configuracao_has_Componentes as cc on cc.Componentes_Nome = comp.Nome " +
            "SET comp.Stock =  comp.Stock -1 " +
            "WHERE cc.Configuracao_idConfiguracao = "+configID+";");
            pst.execute();
        AConnection.closeConection(con);
        }
        
    }
    
    
}

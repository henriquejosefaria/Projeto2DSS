package Funcionalidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Funcionalidade.Componente;
import java.util.stream.Collectors;
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
    
    public void updateStockComponente(Componente c) throws SQLException{
        Connection con = AConnection.createConnection();
        if(con != null){   
            String query = "UPDATE componente SET Stock = ? where Nome = '"+c.getNome()+"';";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, c.getStock());
            pst.execute();
            AConnection.closeConection(con);
        }
        else{
            System.err.println("Exception! Componente not inserted!");
        }
    }
    
    public Componente getComponente(String comp) throws SQLException{
        Connection con = AConnection.createConnection();
        Componente componente = null;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Nome = "+comp);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
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
    
    // devolve lista ordenada por preços de tipo de componente
    public List<Componente> getComponentesOrdemCrescente() throws SQLException{
       List<Componente> componentes = new ArrayList<>(); // criar sort natural
       HashMap<String,ArrayList<Componente>> res = new HashMap<String,ArrayList<Componente>>();
       Configuracao conf;
       Connection con = AConnection.createConnection();
       PreparedStatement pst = con.prepareStatement("SELECT * FROM componente");
       ResultSet rs = pst.executeQuery();
       while(rs.next()){ // cria Map de componentes
           if(!rs.getString(3).equals("motor") && !rs.getString(3).equals("pintura")){
               if(!res.containsKey(rs.getString(3))){ // ex: espelho,motor,...
                   List<Componente> c = new ArrayList<Componente>();
                   Componente comp = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
                   c.add(comp);
                  res.put(rs.getString(3), (ArrayList<Componente>) c);
               } else{
                  res.get(rs.getString(3)).add(new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6)));
               }
           }
       }
       return res.values().stream().map(p->p.get(0)).collect(Collectors.toList());
    }
    
    public List<Componente> getAllcomponentes() throws SQLException{
        List <Componente> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT * FROM componente");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Componente componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
            list.add(componente);
        }
        AConnection.closeConection(con);
        }
        return list;
    }
    
    public List<Encomenda> getAllEncomendas() throws SQLException{
        List <Encomenda> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT * FROM encomenda");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Encomenda encomenda = new Encomenda(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDouble(5),rs.getString(6));
            list.add(encomenda);
        }
        AConnection.closeConection(con);
        }
        return list;
    }
    
    
    public List<Componente> getTipoComponentes(String tipo) throws SQLException{
        List <Componente> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Tipo = '"+tipo+"'");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Componente componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
            list.add(componente);
        }
        AConnection.closeConection(con);
        }
        return list;
    }

    public ArrayList<Componente> getMotores() throws SQLException{
        ArrayList <Componente> list = new ArrayList<>();
        String tipo = "motor";
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Tipo = "+tipo);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Componente componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
                list.add(componente);
            }
            AConnection.closeConection(con);
        }
        return list;
    }

    public ArrayList<Componente> getPinturas() throws SQLException{
        ArrayList <Componente> list = new ArrayList<>();
        String tipo = "pintura";
        Connection con = AConnection.createConnection();
        if(con!=null){
            PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Tipo = "+tipo);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Componente componente = new Componente(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getString(6));
                list.add(componente);
            }
            AConnection.closeConection(con);
        }
        return list;
    }
    
    public int getComponenteStock(String nome) throws SQLException{
        Connection con = AConnection.createConnection();
        Componente componente = null;
        int stock = -1;
        PreparedStatement pst = con.prepareStatement("SELECT * FROM componente WHERE Nome = '"+nome+"';");
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            stock = rs.getInt(2);
        }
        AConnection.closeConection(con);
        return stock;
    }
}

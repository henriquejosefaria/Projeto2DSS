package funcionalidade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriquefaria
 */
public class BaseDados {
    private int i;
    private Map<Integer,Utilizador> users;
    private Map<String,Componente> comp;
    private Map<Integer,Encomenda> encom;
    private Map<String,Pacote> packages;
    private ArrayList<Modelo> models;
    private Map<Integer,Configuracao> configs;
    private Integer lastUserId;
    private Integer lastConfigId;
   
    public BaseDados() throws SQLException{
        
        users = new HashMap<>();
        comp = new HashMap<>();
        encom = new HashMap<>();
        packages = new HashMap<>();
        models = new ArrayList<>();
        configs = new HashMap<>();
        
        String url = "jdbc:mysql://localhost:3307/stand?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "Jafar Strogonof";
        String password = "Jafar";
        Connection con = null;

        System.out.println("Connecting to MySQL Database...");
        String query1 = "SELECT * FROM utilizador";
        String query2 = "SELECT * FROM componente";
        String query3 = "SELECT * FROM configuracao";
        String query4 = "SELECT * FROM configuracao_has_componentes";
        String query5 = "SELECT * FROM modelo";
        String query6 = "SELECT * FROM pacote";
        String query7 = "SELECT * FROM encomenda";
        String query8 = "SELECT * FROM lastids";
        

        try {
            con = DriverManager.getConnection(url, username, password);
             System.out.println("MySQL Database connected!");
             
            PreparedStatement pstUser = con.prepareStatement(query1);
            ResultSet rsUser = pstUser.executeQuery();
            while (rsUser.next()) {
                if(rsUser.getString(4).equals("A")){
                Admin admin = new Admin(rsUser.getInt(1),rsUser.getString(2),rsUser.getString(3));
                users.put(rsUser.getInt(1),admin);
                }
                if(rsUser.getString(4).equals("S")){
                FuncionarioStand funcS = new FuncionarioStand(rsUser.getInt(1),rsUser.getString(2),rsUser.getString(3));
                users.put(rsUser.getInt(1),funcS);
                }
                if(rsUser.getString(4).equals("F")){
                FuncionarioFabrica funcF = new FuncionarioFabrica(rsUser.getInt(1),rsUser.getString(2),rsUser.getString(3));
                users.put(rsUser.getInt(1),funcF);
                }
            }
            
            System.out.println("Utilizadores loaded from MySQL DB: " + users.size());
            
            PreparedStatement pstComponentes = con.prepareStatement(query2);
            ResultSet rsComponente = pstComponentes.executeQuery();        
            while (rsComponente.next()) {
                Componente comps = new Componente(rsComponente.getString(1),rsComponente.getInt(2),rsComponente.getString(3),
                rsComponente.getDouble(4),rsComponente.getString(5));
                comp.put(comps.getNome(),comps);
            }
       
            System.out.println("Componentes loaded from MySQL DB: " + comp.size());
            
            PreparedStatement pstConfig = con.prepareStatement(query3);
            ResultSet rsConfig = pstConfig.executeQuery();     
            while (rsConfig.next()) {
                Configuracao config = new Configuracao(rsConfig.getInt(1),rsConfig.getString(2),null,rsConfig.getString(3),rsConfig.getString(4));
                configs.put(config.getId(),config);
            }
            
            PreparedStatement pstConfigComp = con.prepareStatement(query4);
            ResultSet rsConfigComp = pstConfigComp.executeQuery();     
            while (rsConfigComp.next()) {
                String NComp = (rsConfigComp.getString(2));
                Integer idConfig = (rsConfigComp.getInt(1));
                configs.get(idConfig).addComponente(NComp);
            }
           
            System.out.println("Configuracoes loaded from MySQL DB: " + configs.size());
            
            PreparedStatement pstModelo = con.prepareStatement(query5);
            ResultSet rsModelo = pstModelo.executeQuery();     
            while (rsModelo.next()) {
                Modelo modelo = new Modelo(rsModelo.getString(1));
                models.add(modelo);
            }
            
            System.out.println("Modelos loaded from MySQL DB: " + models.size());
            
            PreparedStatement pstPacote = con.prepareStatement(query6);
            ResultSet rsPacote = pstPacote.executeQuery();     
            while (rsPacote.next()) {
                Pacote pacote = new Pacote(rsPacote.getString(1),rsPacote.getInt(2));
                packages.put(pacote.getNome(), pacote);
            }
            System.out.println("Pacotes loaded from MySQL DB: " + packages.size());

            PreparedStatement pstEncomenda = con.prepareStatement(query7);
            ResultSet rsEncomenda = pstEncomenda.executeQuery();     
            while (rsEncomenda.next()) {
                Encomenda encomenda = new Encomenda(rsEncomenda.getInt(1),rsEncomenda.getString(2),rsEncomenda.getInt(3),rsEncomenda.getInt(4));
                encom.put(encomenda.getId(),encomenda);
            }
            System.out.println("Encomendas loaded from MySQL DB: " + encom.size());
            
            PreparedStatement pstLasID = con.prepareStatement(query8);
            ResultSet rsLastID = pstLasID.executeQuery();     
            while (rsLastID.next()) {
                lastUserId = rsLastID.getInt(1);
                lastConfigId = rsLastID.getInt(2);
            }
            System.out.println("LastIds loaded from MySQL DB");
            
            HashUsers utilizadores = new HashUsers(users,lastUserId);
            HashComponentes componentes = new HashComponentes(comp);
            HashEncomendas encomendas = new HashEncomendas(encom);
            Pacotes pacotes = new Pacotes(packages);
            HashConfigs configuracoes = new HashConfigs(configs,lastConfigId);
 
        }catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the MySQL database!", e);

        } finally {
            con.close(); 
        }
    }
    
    public void addUser(Integer id, String nome,String pass,String tipo){
        
        String url = "jdbc:mysql://localhost:3307/stand?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "Jafar Strogonof";
        String password = "Jafar";
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Database connected!");
             
            String query = "INSERT INTO utilizador (idFuncionario,Nome,Password,Tipo)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.setString(2, nome);
            preparedStmt.setString(3, pass);
            preparedStmt.setString(4, tipo);

            preparedStmt.execute();
      
            con.close();
        
        }catch (Exception e){
            System.err.println("Exception! User not inserted!");
            System.err.println(e.getMessage());
        }
    }
    
    public void addComponente(String nome, Integer stock,Double preco,String descricao){
        
        String url = "jdbc:mysql://localhost:3307/stand?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "Jafar Strogonof";
        String password = "Jafar";
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Database connected!");
             
            String query = "INSERT INTO componente (Nome,Stock,Preco,Descricao)";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, nome);
            preparedStmt.setInt(2, stock);
            preparedStmt.setDouble(3, preco);
            preparedStmt.setString(4, descricao);

            preparedStmt.execute();
      
            con.close();
        
        }catch (Exception e){
            System.err.println("Exception! Componente not inserted!");
            System.err.println(e.getMessage());
        }
    }
    
    
    

    
    public static void main(String args[]) throws SQLException {
        new BaseDados();
    }
}

package Funcionalidade;
import java.sql.SQLException;
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
public class Facade {
    private UtilizadorDAO userDAO;
    private ConfiguracaoDAO configDAO;
    private Integer selectedConfigId;
    private Configuracao selectedConfig;
   
    private ComponenteDAO compDAO;

    
    
    public Facade(){
        this.userDAO = new UtilizadorDAO();
        this.configDAO = new ConfiguracaoDAO();
        this.compDAO = new ComponenteDAO();
        this. selectedConfigId = -1;
        selectedConfig = new Configuracao();
    }
    
    public Integer getSelectedConfigId() {
        return selectedConfigId;
    }
    
    public Configuracao getSelectedConfig() {
        return selectedConfig;
    }
    
    public Configuracao getConfig(Integer id) throws SQLException {
        return configDAO.getConfiguracao(id);
    }
    public void setSelectedConfig(Integer id) throws SQLException {
        Configuracao config = getConfig(id);
        selectedConfig = config;
        selectedConfigId = id;
    }
    
    public boolean autentication(Integer id, String pass) throws SQLException{
        Utilizador user = userDAO.getUtilizador(id);
        return user.getPassword().equals(pass);
    }
    
    public List<Componente> getConfigComponents(Integer configID) throws SQLException{
        return configDAO.getComponentes(configID);
    }
    
    public List<Componente> getTypeComponentes(String type) throws SQLException{
        return compDAO.getTipoComponentes(type);
    }

    
    public List<Configuracao> getConfiguracoes() throws SQLException{
        List<Configuracao> configs = configDAO.getConfiguracoes(); 
        return configs;
    }
    
    public Configuracao newConfiguracao() throws SQLException{
        return new Configuracao();
    }       
    
}

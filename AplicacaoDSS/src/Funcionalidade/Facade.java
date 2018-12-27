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
    
    
    public Facade(){
        this.userDAO = new UtilizadorDAO();
    }
    public boolean autentication(Integer id, String pass) throws SQLException{
        Utilizador user = userDAO.getUtilizador(id);
        return user.getPassword().equals(pass);
    }
    
    public List<Configuracao> getConfiguracoes() throws SQLException{
        List<Configuracao> configs = configDAO.getConfiguracoes(); 
        return configs;
    }
    
            
    
}

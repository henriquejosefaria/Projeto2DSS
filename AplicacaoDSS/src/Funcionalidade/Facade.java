package Funcionalidade;
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
public class Facade {
    private UtilizadorDAO userDAO;
    private ConfiguracaoDAO configDAO;
    private Integer selectedConfigId;
    private Configuracao selectedConfig;
    private ComponenteDAO compDAO;
    private ModeloDAO modeloDAO;
    

    
    
    public Facade() throws SQLException{
        this.userDAO = new UtilizadorDAO();
        this.configDAO = new ConfiguracaoDAO();
        this.compDAO = new ComponenteDAO();
        this. selectedConfigId = 999;
        selectedConfig = new Configuracao();
    }
    
    public Integer getSelectedConfigId() {
        return selectedConfigId;
    }
    
    public Configuracao getSelectedConfig() {
        return selectedConfig;
    }
    
    public UtilizadorDAO getUserDAO(){
        return userDAO;
    }
    
    public String checkUserType(Utilizador u){
        if(u instanceof FuncionarioStand){
            return "S";
        }
        else if(u instanceof FuncionarioFabrica){
            return "F";
        }
        else return "A";
    }
    
    public Configuracao getConfig(Integer id) throws SQLException {
        return configDAO.getConfiguracao(id);
    }
    public void setSelectedConfig(Integer id) throws SQLException {
        Configuracao config = getConfig(id);
        selectedConfig = config;
        selectedConfigId = id;
    }
    
    public void setSelectedConfig(Configuracao config) {
        selectedConfig = config;
        selectedConfigId = config.getId();
    }
    
    public void setSelectedConfigModel(Modelo m){
        selectedConfig.setModelo(m.getNome());
        selectedConfig.addPreco(m.getPreco());
    }
    
    public boolean autentication(Integer id, String pass) throws SQLException{
        if(userDAO.containsUtilizador(id)){
            Utilizador user = userDAO.getUtilizador(id);
            return user.getPassword().equals(pass);
        }
        return false;
    }
    
    public List<Componente> getConfigComponents(Integer configID) throws SQLException{
        return configDAO.getComponentes(configID);
    }
    
    public List<Componente> getTypeComponentes(String type) throws SQLException{
        return compDAO.getTipoComponentes(type);
    }
    
    public List<Componente> getAllComponentes() throws SQLException{
        return compDAO.getAllcomponentes();
    }
    
    public List<Encomenda> getAllEncomendas() throws SQLException{
        return compDAO.getAllEncomendas();
    }

    public void saveSelectedConfig() throws SQLException{
        selectedConfig.setData();
        selectedConfig.setPreco(selectedConfig.calculaPrecoTotal());
        configDAO.addConfiguracao(selectedConfig);
    }
    
    public List<Configuracao> getConfiguracoes(Integer n) throws SQLException{
        List<Configuracao> configs = configDAO.getConfiguracoes(n); 
        return configs;
    }
    
    public Configuracao newConfiguracao() throws SQLException{
        return new Configuracao();
    }  
    
    public ArrayList<Modelo> getModelos() throws SQLException{
        return modeloDAO.getModelos();
    }

    public ArrayList<Componente> getMotores() throws SQLException{
        return compDAO.getMotores();
    }

    public ArrayList<Componente> getPinturas() throws SQLException{
        return compDAO.getPinturas();
    }
    
    public List<Componente> getComponentesOrdemCrescente() throws SQLException{
        return compDAO.getComponentesOrdemCrescente();
    }

    public List<Componente> selecaoAutomatica(Double max, List<Componente> componentes) {
        double i = 0;
        int indice;
        boolean adicionou = false;
        List<Componente> res = new ArrayList<>();
        for(Componente c : componentes){
            i += c.getPreco();
          if(i < max){
            res.add(c);
          } else{
            if(!adicionou){ // tenta ocupar max budjet
              adicionou = true;
              indice = 0;
              for(Componente c1 : res){
                if((i - res.get(indice).getPreco()) < max){
                  i -= res.get(indice).getPreco();
                  res.remove(indice);
                  res.add(c1);
                  adicionou = false;
                  break;
                }
                indice++;
              }
            }
          }
        }
        return res;
    }
    
    public double getPrecoConfig(){
       return this.selectedConfig.getPreco();
    }
    
}

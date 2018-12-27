/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author André
 */
public class HashConfigs {
    
    public Map<Integer, Configuracao> configuracoes;
    private Integer lastID;
    
    public HashConfigs(Map<Integer, Configuracao> configuracoes,Integer lastID){
        this.configuracoes = configuracoes;
        this.lastID = lastID;
    }
    
    public Integer getLastId(){
        return this.lastID;
    }
    
    public void setLastId(Integer id){
        lastID = id;
    }
}

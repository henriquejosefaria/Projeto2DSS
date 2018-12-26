/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;

/**
 *
 * @author André
 */
public class HashConfigs {
    
    public HashMap<Integer, Configuracao> configuracoes;
    private Integer lastID;
    
    public HashConfigs(){
        configuracoes = new HashMap<Integer, Configuracao>();
    }
    
    public Integer getLastId(){
        return this.lastID;
    }
    
    public void setLastId(Integer id){
        lastID = id;
    }
}

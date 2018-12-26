
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class HashUsers {
    
    public Map<Integer, Utilizador> utilizadores; //organizado pelos ids de utilizador
    private Integer lastID; //contador
    
    public HashUsers(Map<Integer, Utilizador> utilizadores,Integer lastID){
        this.utilizadores = utilizadores;
       // utilizadores.put(999999,new Admin());
        lastID = lastID;
    }
    
    public Integer getLastId(){
        return this.lastID;
    }
    
    public void setLastId(Integer id){
        lastID = id;
    }
}

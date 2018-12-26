
import java.util.HashMap;

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
    
    public HashMap<Integer, Utilizador> utilizadores; //organizado pelos ids de utilizador
    private Integer lastID; //contador
    
    public HashUsers(){
        utilizadores = new HashMap<Integer, Utilizador>();
        utilizadores.put(999999,new Admin());
        lastID = 0;
    }
    
    public Integer getLastId(){
        return this.lastID;
    }
    
    public void setLastId(Integer id){
        lastID = id;
    }
}

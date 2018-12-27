/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Utilizador {
    public Integer id = 0;
    public String nome;
    public String password;
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public boolean login(Integer id, String password, HashUsers users){
        if (users.utilizadores.containsKey(id)){
            if(users.utilizadores.get(id).password.equals(password))
                return true;
        }
        return false;
    }
    
    public void logout(Integer id, String password){
        //...
    }
}

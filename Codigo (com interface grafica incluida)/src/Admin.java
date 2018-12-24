/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Admin extends Utilizador {
    
    public Admin(){
        id = 999999;
        nome = "admin";
        password = "admin";
    }
    
    public void registarUtilizador(Utilizador f, HashUsers users){
        Integer id = users.getLastId() + 1;
        f.setId(id);
        users.utilizadores.put(id,f);
        users.setLastId(id);
        //adicionar aqui uma mensagem para dizer ao utilizador qual é o seu id para fazer login
    }
    
    void criarPacote(String nome/*, ... */){
        //...
    }
    
    void eliminarPacote(String nome/*, ... */){
        //...
    }
}

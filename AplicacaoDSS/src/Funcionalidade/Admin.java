package Funcionalidade;
import java.util.ArrayList;

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
    
    public Admin(Integer id,String nome,String password){
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    
    // metodo para verificar se é possivel criar um pacote com os componentes dados
    public boolean verificaPacote(Integer configId){
        //...
        return false;
    }
    
    public boolean criarPacote(String nome, Integer configId, Pacotes pacotes){
        if(!pacotes.pacotes.containsKey(nome)){
            if(verificaPacote(configId)){
                Pacote novoPacote = new Pacote(nome, configId,null);
                pacotes.pacotes.put(nome, novoPacote);
            }
        }
        return false; //existe um pacote com o nome escolhido
    }
    
    public void eliminarPacote(String nome, Pacotes pacotes){
        pacotes.pacotes.remove(nome);
    }
}

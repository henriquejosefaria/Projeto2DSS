
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
    
    // metodo para verificar se é possivel criar um pacote com os componentes dados
    public boolean verificaPacote(ArrayList<String> componentes){
        //...
        return false;
    }
    
    public boolean criarPacote(String nome, ArrayList<String> componentes, Pacotes pacotes){
        if(!pacotes.pacotes.containsKey(nome)){
            if(verificaPacote(componentes)){
                Pacote novoPacote = new Pacote(nome, componentes);
                novoPacote.setNome(nome);
                novoPacote.setComponentes(componentes);
                pacotes.pacotes.put(nome, novoPacote);
            }
        }
        return false; //existe um pacote com o nome escolhido
    }
    
    public void eliminarPacote(String nome, Pacotes pacotes){
        pacotes.pacotes.remove(nome);
    }
}

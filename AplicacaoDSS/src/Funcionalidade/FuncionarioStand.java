package funcionalidade;
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
public class FuncionarioStand extends Utilizador {
    
    public FuncionarioStand(Integer id,String nome, String password){
        this.id = id; //id é dado quando o admin regista o funcionario
        this.nome = nome;
        this.password = password;
    }
    
    //metodo para verificar se é possivel criar uma configuracao com os componentes dados
    public boolean verificaComponentes(ArrayList<String> componentes) {
        //...
        return false;
    }
    
    public boolean guardarConfiguracao(String nome, ArrayList<String> componentes, HashConfigs configs, String modelo, String data){
        if(!configs.configuracoes.containsKey(nome)){
            if(verificaComponentes(componentes)){
                Integer id = configs.getLastId() + 1;
                Configuracao novaConfiguracao = new Configuracao(id,nome, componentes, modelo, data);
                configs.configuracoes.put(id, novaConfiguracao);
                configs.setLastId(id);
            }
        }
        return false; //existe uma configurcao com o nome escolhido
    }
    
    public void retomarConfiguracao(String nome){
        //...
    }
    
    public boolean apagarSelecao(String nome, HashConfigs configs){ //este metodo apaga uma configuraçao selecionada que tinha sido guardada
        if(configs.configuracoes.containsKey(nome)){
            configs.configuracoes.remove(nome);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void selecaoModeloDoCarro(String modelo){
        //...
    }
    
    public void selecaoPacote(String nome){
        //...
    }
    
    public void selecionaConfiguracaoOtima(){
        //...
    }
    
    public void selecionaComponentes(String nome){ //um a um
        //...
    }
    
    public void confirmaEncomenda(){
        //cria encomenda com a configuracao feita e mete o estado da encomenda correspondente
    }
    
    public void finalizaEncomenda(Encomenda encomenda){
        encomenda.setEstado(2);
        // falta enviar para a base de dados ordenadamente
    }
}

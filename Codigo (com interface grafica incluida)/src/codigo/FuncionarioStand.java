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
    
    public FuncionarioStand(){
        nome = "";
        password = "";
    }
    
    public String guardarConfiguracao(){
        //...
        return "nomeQueEscreveuParaAConfiguracao";
    }
    
    public void retomarConfiguracao(Integer id){
        //...
    }
    
    public void apagarSelecao(Integer id){ //este metodo apaga uma configuraçao selecionada que tinha sido guardada
        //...
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
    
    public void finalizaEncomenda(){
        //mete o estado correspondente e envia
    }
}

package funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class FuncionarioFabrica extends Utilizador {
    
    public FuncionarioFabrica(Integer id,String nome, String password){
        this.id = id; //id é dado quando o admin regista o funcionario
        this.nome = nome;
        this.password = password;
    }
    
    public void atualizaStock(Integer quantidade, String nomeComponente, HashComponentes hashcomponentes){
        hashcomponentes.componentes.get(nomeComponente).setStock(quantidade);
    }
}

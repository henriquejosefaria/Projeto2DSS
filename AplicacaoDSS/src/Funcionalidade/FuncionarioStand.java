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
public class FuncionarioStand extends Utilizador {
    
    public FuncionarioStand(Integer id,String nome, String password){
        this.id = id; //id é dado quando o admin regista o funcionario
        this.nome = nome;
        this.password = password;
    }

}

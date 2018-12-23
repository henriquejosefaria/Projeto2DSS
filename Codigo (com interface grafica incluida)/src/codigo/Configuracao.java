/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Configuracao {
    
    private Integer id;
    private ArrayList<String> configuracao; //strings com os nomes dos componentes escolhidos
    
    public Configuracao(){
        id = 999999;
        configuracao = new ArrayList<String>();
    }
}

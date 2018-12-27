package funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author André
 */
public class HashEncomendas {
    
    private Map<Integer, Encomenda> encomendas;
    
    public HashEncomendas(Map<Integer, Encomenda> encomendas){
        this.encomendas = encomendas;
    }
}

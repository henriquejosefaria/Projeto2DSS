package Funcionalidade;/*
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
public class HashComponentes {
    
    public Map<String, Componente> componentes; //ordenada pelos nomes em vez de Ids porque são todos nomes unicos
    
    public HashComponentes(Map<String, Componente> componentes){
        this.componentes = componentes;
    }
}

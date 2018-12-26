/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;

/**
 *
 * @author André
 */
public class HashComponentes {
    
    public HashMap<String, Componente> componentes; //ordenada pelos nomes em vez de Ids porque são todos nomes unicos
    
    public HashComponentes(){
        componentes = new HashMap<String, Componente>();
    }
}

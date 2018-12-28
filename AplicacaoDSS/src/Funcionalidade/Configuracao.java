package Funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author André
 */
public class Configuracao {
    
    private Integer nContribuinte;
    private Integer id;
    private String modelo;
    private String data;
    private List<Componente> componentes = new ArrayList<>();
    
    public Configuracao(){
        this.nContribuinte = -1;
        this.id = -1;
        this.modelo = null;
        this.data = null;
        this.componentes = new ArrayList<>();
    }
    
    public Configuracao(Integer id,Integer n, ArrayList<Componente> componentes, String modelo, String data){
        this.id = id;
        this.nContribuinte = n;
        this.componentes = new ArrayList<>();
        componentes.forEach((c)->{
            this.componentes.add(c);
    });
        this.modelo = modelo;
        this.data = data;
    }

    public Integer getNContribuinte() {
        return nContribuinte;
    }

    public Integer getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getData() {
        return data;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
    
    public void setNContribuinte(Integer n){
        this.nContribuinte = n;
    }
    
    public void addComponente(Componente componente){
        componentes.add(componente);
    }
    
    public void removeComponente(Componente componente){
        componentes.remove(componente);
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}
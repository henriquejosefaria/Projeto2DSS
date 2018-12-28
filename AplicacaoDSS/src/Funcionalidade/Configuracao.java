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
    private String nome;

    public Integer getnContribuinte() {
        return nContribuinte;
    }

    public String getNome() {
        return nome;
    }
    private String data;
    private List<Componente> componentes = new ArrayList<>();
    
    public Configuracao(){
        this.nContribuinte = -1;
        this.id = -1;
        this.modelo = null;
        this.data = null;
        this.componentes = new ArrayList<>();
    }
    
    public Configuracao(Integer id,String nome,Integer n, ArrayList<Componente> componentes, String modelo, String data){
        this.id = id;
        this.nome = nome;
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
    
    public void addComponente(Componente c){
        for(Componente comp : componentes){
            if(comp.getNome().equals(c.getNome())){return;}
        }
        if(c.getTipo().equals("Motor")||c.getTipo().equals("Pneu")|| c.getTipo().equals("Jante"))
        {
            replaceComponente(c);
        }
        else{
        componentes.add(c);
        }
    }
    
    public void removeComponente(Componente componente){
        componentes.remove(componente);
    }
    
    public Componente getComponenteByTipo(String tipo){
        for(Componente c :componentes){
            if(c.getTipo().equals(tipo))
                return c;
        }
        return null;
    }
    public void replaceComponente(Componente c){
        Componente comp = getComponenteByTipo(c.getTipo());
        if(comp!=null){
        removeComponente(comp);
        componentes.add(c);
        }
        else{
            componentes.add(c);
        }
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}
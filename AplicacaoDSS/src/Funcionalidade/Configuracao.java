package funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author André
 */
public class Configuracao {
    
    private Integer nContribuinte;
    private Integer id;
    private String modelo;
    private String data;
    private ArrayList<String> componentes;
    
    public Configuracao(Integer id,Integer n, ArrayList<String> componentes, String modelo, String data){
        this.id = id;
        this.nContribuinte = n;
        this.componentes = componentes;
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

    public ArrayList<String> getComponentes() {
        return componentes;
    }
    
    public void setNContribuinte(Integer n){
        this.nContribuinte = n;
    }
    
    public void addComponente(String nome){
        componentes.add(nome);
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}
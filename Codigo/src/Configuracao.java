/*
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
    
    private String nomeCliente;
    private Integer id;
    private String modelo;
    private String data;
    private ArrayList<String> componentes;
    
    public Configuracao(Integer id,String nome, ArrayList<String> componentes, String modelo, String data){
        this.id = id;
        this.nomeCliente = nome;
        this.componentes = componentes;
        this.modelo = modelo;
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
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
    
    public void setNome(String nome){
        this.nomeCliente = nome;
    }
    
    public void addComponente(String nome){
        componentes.add(nome);
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
}
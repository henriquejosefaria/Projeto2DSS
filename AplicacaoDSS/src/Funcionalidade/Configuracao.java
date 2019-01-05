package Funcionalidade;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    private String data;
    private double preco;
    private List<Componente> componentes = new ArrayList<>();
    private String estado;

    public Integer getnContribuinte() {
        return nContribuinte;
    }

    public String getNome() {
        return nome;
    }
    
    public Configuracao(){
        this.nContribuinte = -1;
        this.id = 9999999;
        this.modelo = null;
        this.nome = null;
        this.data = null;
        this.preco = 0;
        this.componentes = new ArrayList<>();
        this.estado = "A";
    }
    
    public Configuracao(Integer id,String nome,Integer n, ArrayList<Componente> componentes, String modelo,double p, String data, String estado){
        this.id = id;
        this.nome = nome;
        this.nContribuinte = n;
        this.componentes = new ArrayList<>();
        componentes.forEach((c)->{
            this.componentes.add(c);
    });
        this.modelo = modelo;
        this.preco = p;
        this.data = data;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    
    public double getPreco(){
        return preco;
    }

    public String getData() {
        return data;
    }
    public void setData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        data = dateTime.format(formatter);
        
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
        if(c.getTipo().equals("Motor")||c.getTipo().equals("Pneu")|| c.getTipo().equals("Jante")|| c.getTipo().equals("Tinta"))
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
    
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void addPreco(double d){
        this.preco+=d;
    }
    public void setPreco(int preco){
        this.preco = preco;
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
    public int calculaPrecoTotal(){
        int valor = 0;
        for(Componente c :componentes){
            valor += c.getPreco();
        }
        return valor;
    }
    
}
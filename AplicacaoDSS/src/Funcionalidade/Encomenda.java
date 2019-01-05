package Funcionalidade;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author André
 */
public class Encomenda {
    
    private Integer id;
    private String data; //usar data noutro formato?
    private String estado; //a fazer / completo
    private Double preco;
    private String image;

    public Encomenda(Integer id, String data, String estado, Integer configId,Double preco,String image) {
        this.id = id;
        this.data = data;
        this.estado = estado;
        this.configId = configId;
        this.preco = preco;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }
    
    public String getImagem() {
        return image;
    }

    public Integer getConfigId() {
        return configId;
    }
    private Integer configId;
    
    public void setEstado(String estado){
        this.estado = estado;
    }

    public double getPreco() {
        return preco;
    }

    public void setData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        data = dateTime.format(formatter);
        
    }
    
    public LocalDateTime stringToDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
        return dateTime;
    }
    
    public void finalizaEncomenda(Encomenda encomenda){
        encomenda.setEstado("a fazer");
        // falta enviar para a base de dados ordenadamente
    }
}

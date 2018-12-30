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
    private Integer estado; //0: em progresso / 0: confirmada / 1: finalizada (enviada para a fabrica)
    private Double preco;

    public Encomenda(Integer id, String data, Integer estado, Integer configId,Double preco) {
        this.id = id;
        this.data = data;
        this.estado = estado;
        this.configId = configId;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Integer getEstado() {
        return estado;
    }

    public Integer getConfigId() {
        return configId;
    }
    private Integer configId;
    
    public void setEstado(Integer estado){
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
}

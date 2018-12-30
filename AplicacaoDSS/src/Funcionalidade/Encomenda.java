package Funcionalidade;/*
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
    private Integer configId;

    public Encomenda(Integer id, String data, Integer estado, Integer configId) {
        this.id = id;
        this.data = data;
        this.estado = estado;
        this.configId = configId;
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

    
    public void setEstado(Integer estado){
        this.estado = estado;
    }
}

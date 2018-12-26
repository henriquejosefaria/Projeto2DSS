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
    
    public Encomenda(){
        id = 999999;
        data = "";
        estado = 0;
    }
    
    public void setEstado(Integer estado){
        this.estado = estado;
    }
}

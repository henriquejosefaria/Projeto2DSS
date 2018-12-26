package codigo;


import codigo.Configuracao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriquefaria
 */
public class Encomenda {
    private Configuracao configuracao;
    private String nomeCliente;
    
    public Encomenda(){
        this.configuracao = new Configuracao();
        this.nomeCliente = null;
    }

    public Encomenda(Configuracao configuracao, String nomeCliente) {
        this.configuracao = configuracao;
        this.nomeCliente = nomeCliente;
    }
    
    public Encomenda(Encomenda e){
        this.configuracao = e.getConfiguracao();
        this.nomeCliente = e.getNomeCliente();
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Encomenda{ ");
        s.append(configuracao.toString());
        s.append("Nome Cliente : ").append(nomeCliente);
        s.append("}");
        return s.toString();
    }
    
    @Override
    public Encomenda clone(){
        return new Encomenda(this);
    }
    
    
}

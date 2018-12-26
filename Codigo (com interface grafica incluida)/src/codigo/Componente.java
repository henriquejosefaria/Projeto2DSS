package codigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriquefaria
 */
public class Componente {
    private String nome;
    private double preco;
    private String descricao;
    private int tipo;
    private int stock;

    public Componente(){
        this.nome = null;
        this.preco = 0;
        this.descricao = null;
        this.tipo = 0;
        this.stock = 0;
    }
    
    public Componente(String nome, double preco, String descricao, int tipo, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tipo = tipo;
        this.stock = stock;
    }
    
    public Componente(Componente c){
        this.nome = c.getNome();
        this.preco = c.getPreco();
        this.descricao = c.getDescricao();
        this.tipo = c.getTipo();
        this.stock = c.getStock();
    }
    
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public int getStock() {
        return stock;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Componente { ");
        s.append("Nome : ").append(nome);
        s.append(", Preco : ").append(preco);
        s.append(", Descricao : ").append(descricao);
        s.append(", Tipo : ").append(tipo);
        s.append(", Stock : ").append(stock);
        s.append("}");
        return s.toString();
    }
    
    @Override
    public Componente clone(){
        return new Componente(this);
    }   
    
}

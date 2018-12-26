

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriquefaria
 */
public class Cliente {
    private String nome;
    private int telemovel;
    private String email;
    private String morada;
    private String codigoPostal;
    
    public Cliente(){
        this.nome = null;
        this.telemovel = 0;
        this.email = null;
        this.morada = null;
        this.codigoPostal = null;
    }

    public Cliente(String nome, int telemovel, String email, String morada, String codigoPostal) {
        this.nome = nome;
        this.telemovel = telemovel;
        this.email = email;
        this.morada = morada;
        this.codigoPostal = codigoPostal;
    }
    
    public Cliente(Cliente c){
        this.nome = c.getNome();
        this.telemovel = c.getTelemovel();
        this.email = c.getEmail();
        this.morada = c.getMorada();
        this.codigoPostal = c.getCodigoPostal();
    }

    public String getNome() {
        return nome;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }

    public String getMorada() {
        return morada;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nCliente{ ");
        s.append("Nome : ").append(nome);
        s.append(", Telemovel : ").append(telemovel);
        s.append(", Email : ").append(email);
        s.append(", Morada : ").append(morada);
        s.append(", Código Postal : ").append(codigoPostal).append("}");
        return s.toString();
    }
    @Override
    public Cliente clone(){
        return new Cliente(this);
    }
    
    
}

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
public class Utilizador {
    private String nome;
    private String password;

    public Utilizador(){
        this.nome = "basico";
        this.password = "basico"; 
    }
    public Utilizador(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }
    public Utilizador(Utilizador u){
        this.nome = u.getNome();
        this.password = u.getPassword();
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nUtilizador{ Nome: ").append(nome);
        s.append("; Password: ").append(password).append("}");
        return s.toString();
    }
    
    @Override
    public Utilizador clone(){
        return new Utilizador(this);
    }
    
}

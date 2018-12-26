/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import codigo.Componente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henriquefaria
 */
public class Pacote {
    private String nome;
    private double desconto;
    private List<Componente> componentes = new ArrayList<>();
    
    public Pacote(){
        this.nome = null;
        this.desconto = 0;
        this.componentes = new ArrayList<>();
    }

    public Pacote(String nome, List<Componente> c) {
        this.nome = nome;
        c.forEach((comp) -> {
            this.componentes.add(comp.clone());
        });
    }
    
    public Pacote(Pacote m){
        this.nome = m.getNome();
        m.getComponentes().forEach((c) -> {
            this.componentes.add(c.clone());
        });
    }

    public String getNome() {
        return nome;
    }

    public List<Componente> getComponentes() {
        List<Componente> c = new ArrayList<>();
        this.componentes.forEach((comps) -> {
            c.add(comps.clone());
        });
        return c;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComponentes(List<Componente> componentes) {
        componentes.forEach((c) -> {
            this.componentes.add(c.clone());
        });
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Modelo{ ");
        s.append("Nome : ").append(nome);
        s.append("Componentes{ ");
        this.componentes.forEach((c) -> {
            s.append(c.toString());
        });
        s.append("}}");
        return s.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Pacote clone(){
        return new Pacote(this);
    }
    
}

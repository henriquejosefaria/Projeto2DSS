


import codigo.Utilizador;
import codigo.Pacote;
import codigo.Modelo;
import codigo.Encomenda;
import codigo.Configuracao;
import codigo.Componente;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriquefaria
 */
public class BaseDados {
    private List<Pacote> pacotes = new ArrayList<Pacote>();
    private List<Componente> componentes = new ArrayList<Componente>();
    private List<Modelo> modelos = new ArrayList<Modelo>();
    private List<Configuracao> configuracoes = new ArrayList<Configuracao>();
    private List<Encomenda> encomendas = new ArrayList<Encomenda>();
    private List<Encomenda> emEspera = new ArrayList<Encomenda>();
    private List<Utilizador> users = new ArrayList<Utilizador>();
    
    public BaseDados(){
        this.pacotes = new ArrayList<Pacote>();
        this.componentes = new ArrayList<Componente>();
        this.modelos = new ArrayList<Modelo>();
        this.configuracoes = new ArrayList<Configuracao>();
        this.encomendas = new ArrayList<Encomenda>();
        this.emEspera = new ArrayList<Encomenda>();
        this.users = new ArrayList<Utilizador>(); 
    }
    
    public BaseDados(ArrayList<Pacote> p, ArrayList<Componente> c, ArrayList<Modelo> m, ArrayList<Configuracao> conf, ArrayList<Encomenda> e1, ArrayList<Encomenda> e2, ArrayList<Utilizador> u){
        p.forEach((p1) -> {
            this.pacotes.add(p1.clone());
        });
        c.forEach((c1) -> {
            this.componentes.add(c1.clone());
        });
        m.forEach((m1) -> {
            this.modelos.add(m1.clone());
        });
        conf.forEach((conf1) -> {
            this.configuracoes.add(conf1.clone());
        });
        e1.forEach((e) -> {
            this.encomendas.add(e.clone());
        });
        e2.forEach((e) -> {
            this.emEspera.add(e.clone());
        });
        u.forEach((u1) -> {
            this.users.add(u1.clone());
        });
    }
    
    public BaseDados(BaseDados bd){
        this.pacotes = bd.getPacotes();
        this.componentes = bd.getComponentes();
        this.modelos = bd.getModelos();
        this.configuracoes = bd.getConfiguracoes();
        this.encomendas = bd.getEncomendas();
        this.emEspera = bd.getEmEspera();
        this.users = bd.getUsers();
    }
  
    public List<Pacote> getPacotes() {
        List<Pacote> p = new ArrayList<>();
        this.pacotes.forEach((p1) -> {
            p.add(p1.clone());
        });
        return p;
    }

    public List<Componente> getComponentes() {
        List<Componente> c = new ArrayList<>();
        this.componentes.forEach((c1) -> {
            c.add(c1.clone());
        });
        return c;
    }

    public List<Modelo> getModelos() {
        List<Modelo> m = new ArrayList<>();
        this.modelos.forEach((m1) -> {
            m.add(m1.clone());
        });
        return m;
    }

    public List<Configuracao> getConfiguracoes() {
        List<Configuracao> conf = new ArrayList<>();
        this.configuracoes.forEach((conf1) -> {
            conf.add(conf1.clone());
        });
        return conf;
    }

    public List<Encomenda> getEncomendas() {
        List<Encomenda> e1 = new ArrayList<>();
        this.encomendas.forEach((e) -> {
            e1.add(e.clone());
        });
        return e1;
    }

    public List<Encomenda> getEmEspera() {
        List<Encomenda> e1 = new ArrayList<>();
        this.emEspera.forEach((e) -> {
            e1.add(e.clone());
        });
        return e1;
    }

    public List<Utilizador> getUsers() {
        List<Utilizador> u = new ArrayList<>();
        this.users.forEach((u1) -> {
            u.add(u1.clone());
        });
        return u;
    }

    public void setPacotes(List<Pacote> p) {
         p.forEach((p1) -> {
            this.pacotes.add(p1.clone());
        });
    }

    public void setComponentes(List<Componente> c) {
        c.forEach((c1) -> {
            this.componentes.add(c1.clone());
        });
    }

    public void setModelos(List<Modelo> m) {
        m.forEach((m1) -> {
            this.modelos.add(m1.clone());
        });
    }

    public void setConfiguracoes(List<Configuracao> conf) {
        conf.forEach((conf1) -> {
            this.configuracoes.add(conf1.clone());
        });
    }

    public void setEncomendas(List<Encomenda> e1) {
        e1.forEach((e) -> {
            this.encomendas.add(e.clone());
        });
    }

    public void setEmEspera(List<Encomenda> e1) {
        e1.forEach((e) -> {
            this.emEspera.add(e.clone());
        });
    }

    public void setUsers(List<Utilizador> u) {
        u.forEach((u1) -> {
            this.users.add(u1.clone());
        });
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("BaseDados{ ");
        this.pacotes.forEach((p) -> {
            s.append(p.toString());
        });
        this.componentes.forEach((c) -> {
            s.append(c.toString());
        });
        this.modelos.forEach((m) -> {
            s.append(m.toString());
        });
        this.configuracoes.forEach((conf) -> {
            s.append(conf.toString());
        });
        this.encomendas.forEach((e) -> {
            s.append(e.toString());
        });
        this.emEspera.forEach((e) -> {
            s.append(e.toString());
        });
        this.users.forEach((u) -> {
            s.append(u.toString());
        });
        s.append("}");
        return s.toString();
    }
    
    @Override
    public BaseDados clone(){
        return new BaseDados(this);
    }
}

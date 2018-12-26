package codigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import codigo.Componente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henriquefaria
 */
public class Configuracao {
    private String nomeCliente;
    private double preco;
    private LocalDate data;
    private Pacote pacote;
    private List<Componente> componentes = new ArrayList<>();

    public Configuracao(){
        this.nomeCliente = null;
        this.preco = 0;
        this.data = LocalDate.now();
        this.pacote = new Pacote();
        this.componentes = new ArrayList<>();
    }

    public Configuracao(String nomeCliente, double preco, LocalDate data, Pacote pacote,List<Componente> c) {
        this.nomeCliente = nomeCliente;
        this.preco = preco;
        this.data = data;
        this.pacote = pacote;
        for(Componente comp : c){
            this.componentes.add(comp.clone());
        }
    }
    
    public Configuracao(Configuracao c){
        this.nomeCliente = c.getNomeCliente();
        this.preco = c.getPreco();
        this.data = c.getData();
        this.pacote = c.getPacote();
        this.componentes = c.getComponentes();
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getData() {
        return data;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public List<Componente> getComponentes() {
        List<Componente> c = new ArrayList<>();
        this.componentes.forEach((comp) -> {
            c.add(comp.clone());
        });
        return c;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public void setComponentes(List<Componente> componentes) {
        componentes.forEach((c) -> {
            this.componentes.add(c.clone());
        });
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("\nConfiguração{ " );
        s.append("Nome Cliente : ").append(nomeCliente);
        s.append(", Preço : ").append(preco);
        s.append(", Data : ").append(data.toString());
        s.append(", Pacote : ").append(pacote);
        s.append("Componentes{ ");
        componentes.forEach((c) -> {
            s.append(" ").append(c.getNome()).append(" ");
        });
        s.append("}}");
        return s.toString();
    }
    
    @Override
    public Configuracao clone(){
        return new Configuracao(this);
    }
    
}

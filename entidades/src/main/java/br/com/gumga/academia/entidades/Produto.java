package br.com.gumga.academia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    
    @Column(precision = 10, scale = 2, name = "valor", nullable = false)
    private Double valor;
    
    public Produto() {
    
    }
    
    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }    

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}

package br.com.gumga.academia;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Usuario
 */
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "nome_cli", length = 500)
    private String nome;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastro = new Date();
    
    public Cliente() {
    
    }
    
    public Cliente(String nome){
        this.nome = nome;
    }    

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getCada_cad() {
        return dataCadastro;
    }

    public void setCada_cad(Date cada_cad) {
        this.dataCadastro = cada_cad;
    }
    
    
}

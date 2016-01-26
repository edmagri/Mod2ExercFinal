package br.com.gumga.academia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
public class Pedido {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date data = new Date();

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Cliente cliente;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ItemPedido> itens = new ArrayList<ItemPedido>();
    
    public Pedido() {
    
    }
    
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}

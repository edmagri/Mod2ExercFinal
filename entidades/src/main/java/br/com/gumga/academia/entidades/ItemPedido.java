package br.com.gumga.academia.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class ItemPedido {
    
    @Id
    @GeneratedValue    
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_pedido")
    private Pedido pedido;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_produto")    
    private Produto produto;
    
    @Column(precision = 10, scale = 2, name = "vlr_venda", nullable = false)
    private Double vlrVenda;
    
    public ItemPedido() {
    
    }

    public ItemPedido(Pedido pedido, Produto produto, Double valor ) {
        this.pedido = pedido;
        this.produto = produto;
        this.vlrVenda = valor;
    }
    
    public Long getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrvenda(Double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }
    
    
    
}

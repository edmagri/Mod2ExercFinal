package br.com.gumga.academia.aplicacao.repository;

import br.com.gumga.academia.entidades.Pedido;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}

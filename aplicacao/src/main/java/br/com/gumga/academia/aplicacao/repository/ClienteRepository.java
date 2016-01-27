package br.com.gumga.academia.aplicacao.repository;

import br.com.gumga.academia.entidades.Cliente;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}

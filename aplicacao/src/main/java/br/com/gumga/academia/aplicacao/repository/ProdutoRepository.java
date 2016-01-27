package br.com.gumga.academia.aplicacao.repository;

import br.com.gumga.academia.entidades.Produto;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}

package br.com.gumga.academia.aplicacao;

import br.com.gumga.academia.entidades.Cliente;
import br.com.gumga.academia.entidades.jpa.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class ClienteDao extends Dao {

    public ClienteDao(Class classePersistente) {
        super(classePersistente);
    }

    public List<Cliente> buscarNome() {
        EntityManager manager = JpaUtil.getEntityManager();
        Query query = manager.createQuery("Select c from Cliente c where c.nome like :p_nome"); 
        query.setParameter("p_nome", "A%");
        List<Cliente> clientes = query.getResultList();
        
        return clientes;
    }
}

package br.com.gumga.academia.aplicacao;

import br.com.gumga.academia.entidades.Cliente;
import br.com.gumga.academia.entidades.jpa.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author Usuario
 */
public class Dao<T> {

    private Class<?> classePersistente;
    
    public Dao(Class<?> classePersistente) {
        this.classePersistente = classePersistente; 
    }
    
    public void salvar(T entidade) {
        EntityManager manager = JpaUtil.getEntityManager();         
        EntityTransaction tx = manager.getTransaction();         
        tx.begin();   
        
        Cliente c = new Cliente("Gumga S/A");         
        
        manager.persist(c);         
        tx.commit();         
        manager.close();                        
    }
    
    public void excluir(T entidade) {
        EntityManager manager = JpaUtil.getEntityManager();         
        EntityTransaction tx = manager.getTransaction();         
        tx.begin();   
        
        Cliente c = new Cliente("Gumga S/A");         
        
        manager.remove(manager.merge(entidade));         
        tx.commit();         
        manager.close();                      
    }

    public List<Cliente> buscaTodos() {
        EntityManager manager = JpaUtil.getEntityManager();
        List<T> result = manager.createQuery("Select t From "+classePersistente.getName()+" t").getResultList();
        manager.close();
        return (List<Cliente>) result;
    }

    public Cliente buscaPorId(Long id) {
        EntityManager manager = JpaUtil.getEntityManager();
        T result = (T) manager.find(classePersistente, id);
        manager.close();
        return (Cliente) result;
    }
}

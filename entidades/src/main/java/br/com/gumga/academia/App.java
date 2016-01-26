package br.com.gumga.academia;

import br.com.gumga.academia.entidade.jpa.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManager manager = JpaUtil.getEntityManager();         
        EntityTransaction tx = manager.getTransaction();         
        tx.begin();   
        
        Cliente c = new Cliente("Gumga S/A");         
        
        manager.persist(c);         
        tx.commit();         
        manager.close();         
        JpaUtil.close();        
    }
}

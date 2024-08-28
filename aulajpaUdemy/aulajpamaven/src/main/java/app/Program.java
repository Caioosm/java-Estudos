package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Pessoa;

public class Program {
    public static void main(String[] args) throws Exception {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();


        //maneira de encontrar uma entidade por ID:
        // Pessoa p = em.find(Pessoa.class, 2);

        //maneira de remover uma entitade por ID, nesse caso teria que encontrar a entidade para remover, pois assim viraria uma entidade monitorada e não destacada
        Pessoa p = em.find(Pessoa.class, 2);
        
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        
        System.out.println(p);
        
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}

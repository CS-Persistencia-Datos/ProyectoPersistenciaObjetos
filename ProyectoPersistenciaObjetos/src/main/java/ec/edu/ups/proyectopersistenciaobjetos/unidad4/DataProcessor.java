
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


public class DataProcessor {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unidad_persistencia");
        EntityManager em = entityManagerFactory.createEntityManager();
            try {
            em.getTransaction().begin();
             // Insertar un nuevo cliente
            Cliente cliente = new Cliente();
            cliente.setNombre("Cliente desde proceso");
            em.persist(cliente);
             // Consultar clientes
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
            query.getResultList().forEach(c -> System.out.println("Cliente: " + c.getNombre()));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            entityManagerFactory.close();
        }
    }
}

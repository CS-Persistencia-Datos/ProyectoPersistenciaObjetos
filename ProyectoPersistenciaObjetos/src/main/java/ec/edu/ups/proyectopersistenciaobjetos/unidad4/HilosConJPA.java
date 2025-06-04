
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.*;

public class HilosConJPA {
    private static final ThreadLocal<EntityManager> entityManagerThreadLocal = new ThreadLocal<>();
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unidad_persistencia");

    public static EntityManager getEntityManager() {
        EntityManager em = entityManagerThreadLocal.get();
        if (em == null) {
            em = entityManagerFactory.createEntityManager();
            entityManagerThreadLocal.set(em);
        }
        return em;
    }
    public static void closeEntityManager() {
        EntityManager em = entityManagerThreadLocal.get();
        if (em != null) {
            em.close();
           entityManagerThreadLocal.remove();
        }
    }

    public static void main(String[] args) {
        Runnable task1 = () -> {
            EntityManager em = getEntityManager();
            try {
                em.getTransaction().begin();
                // Insertar un nuevo cliente
                Cliente cliente = new Cliente();
                cliente.setNombre("Cliente 1");
                em.persist(cliente);
                em.getTransaction().commit();
                // Consultar clientes
                TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
query.getResultList().forEach(c -> System.out.println("Cliente: " + c.getNombre()));
            } catch (Exception e) {
                em.getTransaction().rollback();
                e.printStackTrace();
            } finally {
                closeEntityManager();
            }
        };
        Runnable task2 = () -> {
            EntityManager em = getEntityManager();
            try {
                em.getTransaction().begin();
                // Actualizar un producto
                Producto producto = em.find(Producto.class, 1L);
                if (producto != null) {
                    producto.setStock(producto.getStock() - 1);
                    em.merge(producto);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
                e.printStackTrace();
            } finally {
                closeEntityManager();
            }
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
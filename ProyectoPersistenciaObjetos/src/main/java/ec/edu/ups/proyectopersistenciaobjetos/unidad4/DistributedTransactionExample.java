
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.*;

public class DistributedTransactionExample {
    public static void main(String[] args) {
        EntityManager em1 = Persistence.createEntityManagerFactory("unidad_persistencia").createEntityManager();
        EntityManager em2 = Persistence.createEntityManagerFactory("unidad_persistencia").createEntityManager();
        EntityTransaction tx1 = em1.getTransaction();
        EntityTransaction tx2 = em2.getTransaction();
        try {
            tx1.begin();
            tx2.begin();
            // Operaciones en bases de datos distribuidas
            Producto producto1 = em1.find(Producto.class, 1L);
            Producto producto2 = em2.find(Producto.class, 2L);
            producto1.setStock(producto1.getStock() - 1);
            producto2.setStock(producto2.getStock() + 1);
            em1.merge(producto1);
            em2.merge(producto2);
            tx1.commit();
            tx2.commit();
        } catch (Exception e) {
            tx1.rollback();
            tx2.rollback();
            e.printStackTrace();
        } finally {
            em1.close();
            em2.close();
        }
    }
}

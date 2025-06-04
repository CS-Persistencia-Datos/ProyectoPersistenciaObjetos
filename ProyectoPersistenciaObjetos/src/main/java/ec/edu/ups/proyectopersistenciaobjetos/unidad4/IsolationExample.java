
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.*;

public class IsolationExample {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("com.tutorial_ConcurrenciaJPA_jar_1.0-SNAPSHOTPU").createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            // Operaciones de base de datos con nivel de aislamiento configurado
            em.createNativeQuery("SET TRANSACTION ISOLATION LEVEL SERIALIZABLE").executeUpdate();
            Producto producto = em.find(Producto.class, 1L, LockModeType.PESSIMISTIC_WRITE);
            producto.setStock(producto.getStock() - 1);
            em.merge(producto);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}

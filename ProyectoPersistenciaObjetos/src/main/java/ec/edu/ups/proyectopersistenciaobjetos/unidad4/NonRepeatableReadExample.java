
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.*;

public class NonRepeatableReadExample {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("unidad_persistencia").createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Producto producto = em.find(Producto.class, 1L);
            int stockInicial = producto.getStock();
            System.out.println("Stock inicial: " + stockInicial);     
            // Simulación de otra transacción que modifica el stock
            producto.setStock(stockInicial - 5);
            em.merge(producto);
            int stockFinal = producto.getStock();
            System.out.println("Stock final: " + stockFinal);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}

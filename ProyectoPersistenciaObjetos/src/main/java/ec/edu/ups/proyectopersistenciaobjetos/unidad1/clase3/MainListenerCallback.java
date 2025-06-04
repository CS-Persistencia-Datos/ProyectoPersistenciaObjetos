
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.*;


// Pruebas de la clase 3: Estratégia one to one
public class MainListenerCallback {
    
        private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static void main(String[] args) {
        entityManagerFactory = Persistence.createEntityManagerFactory("pu");
        entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();

            // Crear y persistir un nuevo producto
            Producto producto = new Producto();
            producto.setNombre("Laptop");
            producto.setPrecio(1200.0);
            entityManager.persist(producto);
            // Actualizar el producto
            producto.setPrecio(1100.0);
            entityManager.merge(producto);
            // Eliminar el producto
            entityManager.remove(producto);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    
}

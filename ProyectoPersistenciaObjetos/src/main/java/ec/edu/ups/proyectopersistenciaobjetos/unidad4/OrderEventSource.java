
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import jakarta.persistence.*;
import javax.swing.event.EventListenerList;

public class OrderEventSource {
    private final EventListenerList listenerList = new EventListenerList();
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.tutorial_ConcurrenciaJPA_jar_1.0-SNAPSHOTPU");
    public void addOrderEventListener(OrderEventListener listener) {
        listenerList.add(OrderEventListener.class, listener);
    }
    public void removeOrderEventListener(OrderEventListener listener) {
        listenerList.remove(OrderEventListener.class, listener);
    }
    public void processOrder(String customerName, String productName, int quantity) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();       
            // Insertar cliente
            Cliente cliente = new Cliente();
            cliente.setNombre(customerName);
            em.persist(cliente);   
            // Insertar producto y orden
            Producto producto = new Producto();
            producto.setNombre(productName);
            em.persist(producto);            
            Orden orden = new Orden();
            orden.setCliente(cliente);
            orden.setProducto(producto);
            orden.setCantidad(quantity);
            em.persist(orden);            
            em.getTransaction().commit();
            // Disparar el evento
            fireOrderEvent(new OrderEvent(this, "Cliente: " + customerName + ", Producto: " + productName + ", Cantidad: " + quantity));
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    protected void fireOrderEvent(OrderEvent event) {
        Object[] listeners = listenerList.getListeners(OrderEventListener.class);
        for (Object listener : listeners) {
            ((OrderEventListener) listener).orderProcessed(event);
        }
    }
}
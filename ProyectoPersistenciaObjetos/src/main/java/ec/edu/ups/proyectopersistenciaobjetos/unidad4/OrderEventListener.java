
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import java.util.EventListener;

public interface OrderEventListener extends EventListener {
    void orderProcessed(OrderEvent event);
}
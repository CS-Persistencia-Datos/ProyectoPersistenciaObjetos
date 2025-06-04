
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import java.util.EventObject;

public class OrderEvent extends EventObject {
    private final String orderDetails;
    public OrderEvent(Object source, String orderDetails) {
        super(source);
        this.orderDetails = orderDetails;
    }
    public String getOrderDetails() {
        return orderDetails;
    }
}

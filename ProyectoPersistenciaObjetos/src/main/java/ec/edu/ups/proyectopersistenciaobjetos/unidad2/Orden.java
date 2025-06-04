
package ec.edu.ups.proyectopersistenciaobjetos.unidad2;

import ec.edu.ups.proyectopersistenciaobjetos.unidad4.*;
import jakarta.persistence.*;

@Entity
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Producto producto;
    private int cantidad;

    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void procesarOrden() {
        if (producto.reducirStock(cantidad)) {
            System.out.println("Orden procesada: " + cliente.getNombre() + " ha comprado " + cantidad + " unidad(es) de " + producto.getNombre());
        } else {
            System.out.println("Stock insuficiente para " + cliente.getNombre() + " en el producto " + producto.getNombre());
        }
    }
}
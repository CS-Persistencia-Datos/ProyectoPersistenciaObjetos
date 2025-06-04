package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import ec.edu.ups.proyectopersistenciaobjetos.unidad4.Producto;
import jakarta.persistence.*;

//@Entity
public class ProductoListener {

    @PrePersist
    public void prePersist(Producto producto) {
        System.out.println("Listener - PrePersist: " + producto.getNombre());
    }

    @PostPersist
    public void postPersist(Producto producto) {
        System.out.println("Listener - PostPersist: " + producto.getNombre());
    }

    @PreUpdate
    public void preUpdate(Producto producto) {
        System.out.println("Listener - PreUpdate: " + producto.getNombre());
    }

    @PostUpdate
    public void postUpdate(Producto producto) {
        System.out.println("Listener - PostUpdate: " + producto.getNombre());
    }

    @PreRemove
    public void preRemove(Producto producto) {
        System.out.println("Listener - PreRemove: " + producto.getNombre());
    }

    @PostRemove
    public void postRemove(Producto producto) {
        System.out.println("Listener - PostRemove: " + producto.getNombre());
    }

    @PostLoad
    public void postLoad(Producto producto) {
        System.out.println("Listener - PostLoad: " + producto.getNombre());
    }
}

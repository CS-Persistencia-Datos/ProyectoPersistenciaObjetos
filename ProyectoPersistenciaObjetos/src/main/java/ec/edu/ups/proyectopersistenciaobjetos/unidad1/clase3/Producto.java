
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
@EntityListeners(ProductoListener.class)
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "precio")
    private double precio;

    // Getters y Setters (omitidos para brevedad)

    @PrePersist
    public void prePersist() {
        System.out.println("Producto a ser persistido: " + this.nombre);
    }
    @PostPersist
    public void postPersist() {
        System.out.println("Producto persistido con ID: " + this.id);
    }
    @PreUpdate
    public void preUpdate() {
        System.out.println("Producto a ser actualizado: " + this.nombre);
    }
    @PostUpdate
    public void postUpdate() {
        System.out.println("Producto actualizado: " + this.nombre);
    }
    @PreRemove
    public void preRemove() {
        System.out.println("Producto a ser eliminado: " + this.nombre);
    }
    @PostRemove
    public void postRemove() {
        System.out.println("Producto eliminado: " + this.nombre);
    }
    @PostLoad
    public void postLoad() {
        System.out.println("Producto cargado desde la base de datos: " + this.nombre);
    }
}

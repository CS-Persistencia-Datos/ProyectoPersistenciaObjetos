
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import ec.edu.ups.proyectopersistenciaobjetos.unidad3.Orden;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;

    // Relación con Orden
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)  // Puedes cambiar a EAGER para cargar inmediatamente
    private List<Orden> ordenes;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
}
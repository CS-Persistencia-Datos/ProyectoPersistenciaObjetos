
package ec.edu.ups.proyectopersistenciaobjetos.unidad2;

import jakarta.persistence.*;

@Entity // La clase está mapeada como una entidad JPA
@Table(name = "cliente")  // El nombre debe ser correcto y coincida con la tabla en la base de datos.
public class Cliente {
// El identificador único de la entidad (clave primaria)
    @Id
// Generación automática del valor de la clave primaria (esto depende de la base de datos)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // Atributos que representan el nombre del cliente
    private String correo;
    public Long getId() { // Métodos de Acceso (get y set) a las variables del objeto.
        return id;
    }
    public void setId(Long id) {// Métodos de Acceso (get y set) a las variables del objeto.
        this.id = id;
    }
}

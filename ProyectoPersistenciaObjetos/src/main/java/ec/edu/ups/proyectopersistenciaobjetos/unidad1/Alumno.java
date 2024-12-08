
package ec.edu.ups.proyectopersistenciaobjetos.unidad1;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alumno") // Nombre de la tabla en la base de datos
public class Alumno {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private int id;

    @Column(nullable = false, length = 50) // Campo obligatorio con longitud máxima
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Temporal(TemporalType.DATE) // Indica que se mapea como una fecha
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @OneToOne(cascade = CascadeType.ALL) // Relación uno a uno con Dirección
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    private Direccion direccion;

    public Alumno() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

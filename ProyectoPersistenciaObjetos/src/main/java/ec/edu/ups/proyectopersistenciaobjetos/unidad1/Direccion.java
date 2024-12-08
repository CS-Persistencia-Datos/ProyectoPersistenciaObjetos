
package ec.edu.ups.proyectopersistenciaobjetos.unidad1;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion") // Nombre de la tabla en la base de datos
public class Direccion {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private int id;

    @Column(nullable = false, length = 100) // Calle con longitud máxima
    private String calle;

    @Column(nullable = false, length = 50) // Ciudad con longitud máxima
    private String ciudad;

    @Column(nullable = false, length = 10) // Código postal con longitud máxima
    private String codigoPostal;

    @OneToOne(mappedBy = "direccion")//Relación inversa con Alumno
    private Alumno alumno;

    public Direccion() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }   
}

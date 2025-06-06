
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase4;

import jakarta.persistence.*;

//@Entity(name = "")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String tipo;
    private String fabricante;
    private String modelo;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.*;

//@Entity
@DiscriminatorValue("CARRO")
public class Carro extends Vehiculo {

    private int numPuertas;

    // Constructor, getters y setters
    public Carro() {}

    public Carro(String fabricante, String modelo, int numPuertas) {
        super(fabricante, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}

package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase4.JOINED;

import jakarta.persistence.*;

@Entity
public class Carro extends Vehiculo {

    private int numPuertas;

    // Getters y Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}


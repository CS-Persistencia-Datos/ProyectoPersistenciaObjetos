
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase4;

import jakarta.persistence.Entity;

@Entity
public class Motocicleta extends Vehiculo {

    private int motor;

    // Getters y Setters
    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}

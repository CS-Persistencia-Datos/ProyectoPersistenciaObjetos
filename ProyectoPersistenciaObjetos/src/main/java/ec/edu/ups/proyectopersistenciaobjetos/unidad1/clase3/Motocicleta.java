
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("MOTOCICLETA")
public class Motocicleta extends Vehiculo {

    private int cilindrajeMotor;

    // Constructor, getters y setters
    public Motocicleta() {}

    public Motocicleta(String fabricante, String modelo, int cilindrajeMotor) {
        super(fabricante, modelo);
        this.cilindrajeMotor = cilindrajeMotor;
    }

    public int getCilindrajeMotor() {
        return cilindrajeMotor;
    }

    public void setCilindrajeMotor(int cilindrajeMotor) {
        this.cilindrajeMotor = cilindrajeMotor;
    }
}
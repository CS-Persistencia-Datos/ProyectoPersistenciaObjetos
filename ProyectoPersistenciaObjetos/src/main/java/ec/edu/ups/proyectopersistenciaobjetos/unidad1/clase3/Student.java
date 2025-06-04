
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

public class Student {

    private String firstName;
    private String lastName;
    private String email;

    // Constructor vacío
    public Student() {
    }

    // Constructor con parámetros (opcional)
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getter y Setter para firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter y Setter para lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter y Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString (opcional para depuración)
    @Override
    public String toString() {
        return "Student{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

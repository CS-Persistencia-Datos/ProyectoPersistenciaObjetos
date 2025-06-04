
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

@Entity
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
    
    public void saveStudent() {
    // Usar try-with-resources para garantizar el cierre de los recursos
    try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad_persistencia");
         EntityManager em = emf.createEntityManager()) {
        
        // Iniciar una transacción
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();

            // Crear una entidad Student y persistirla
            Student student = new Student();
            student.setFirstName("Diego");
            student.setLastName("Cale");
            student.setEmail("diego.cale92@gmail.com");

            // Persistir el objeto
            em.persist(student);
            transaction.commit();
        } catch (PersistenceException e) {
            // Hacer rollback en caso de error
            if (transaction.isActive()) {
                transaction.rollback();
            }
            // Registrar el error
            e.printStackTrace();
        }
    } catch (Exception e) {
        // Manejar otros errores relacionados con el EntityManagerFactory
        e.printStackTrace();
    }
}

}

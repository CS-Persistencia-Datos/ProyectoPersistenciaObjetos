package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManagerConexion {

    public static void main(String[] args) {
        // Obtener el EntityManagerFactory para la primera unidad de persistencia
        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("pu1");
        EntityManager em1 = emf1.createEntityManager();

// Obtener el EntityManagerFactory para la segunda unidad de persistencia
        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("pu2");
        EntityManager em2 = emf2.createEntityManager();

// Operaciones con las dos bases de datos
// Iniciar una transacción en la primera unidad de persistencia
        em1.getTransaction().begin();
// Realizar operaciones en la base de datos asociada con "pu1"
        Student student = em1.find(Student.class, 1L);
        student.setFirstName("Juan");
        em1.merge(student);
        em1.getTransaction().commit();

// Iniciar una transacción en la segunda unidad de persistencia
        em2.getTransaction().begin();
// Realizar operaciones en la base de datos asociada con "pu2"
        Employee employee = em2.find(Employee.class, 1L);
        employee.setLastName("González");
        em2.merge(employee);
        em2.getTransaction().commit();

// Cerrar los EntityManager
        em1.close();
        em2.close();
        emf1.close();
        emf2.close();

    }
}

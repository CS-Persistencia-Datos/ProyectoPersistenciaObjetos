package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManagerEntity {

    public static void main(String[] args) {
        // Crear la EntityManagerFactory a partir de la unidad de persistencia definida en persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad_persistencia");
// Crear una instancia de EntityManager para interactuar con la base de datos
        EntityManager em = emf.createEntityManager();
        try {
            // Iniciar una transacción para realizar operaciones de persistencia
            em.getTransaction().begin();
            // 1. Crear una nueva entidad de tipo Student (Estado transitorio)
            Student student = new Student();
            student.setFirstName("Diego");
            student.setLastName("Cale");
            student.setEmail("dcale@ups.edu.ec");
            // Persistir la entidad en la base de datos (Estado persistente)
            em.persist(student);
            // 2. Buscar una entidad existente por su ID (Estado persistente)
            Student existingStudent = em.find(Student.class, 1L);
            // Verificar si la entidad existe antes de proceder
            if (existingStudent != null) {
                // 3. Actualizar una entidad existente (Estado gestionado)
                existingStudent.setLastName("Armando");
                em.merge(existingStudent); // Sincroniza los cambios con la base de datos
            }
            // 4. Eliminar una entidad de la base de datos (Estado eliminado)
            if (existingStudent != null) {
                em.remove(existingStudent); // Marca la entidad para eliminación
            }
            // Confirmar la transacción para aplicar los cambios
            em.getTransaction().commit();
        } catch (Exception e) {
            // En caso de error, revertir la transacción para evitar inconsistencias
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Cerrar el EntityManager y la EntityManagerFactory para liberar recursos
            em.close();
            emf.close();
        }

    }
}

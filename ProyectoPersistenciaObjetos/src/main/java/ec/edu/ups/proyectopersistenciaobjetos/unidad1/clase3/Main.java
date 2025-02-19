
package ec.edu.ups.proyectopersistenciaobjetos.unidad1.clase3;

import jakarta.persistence.*;
import java.util.Date;

// Pruebas de la clase 3: Estratégia one to one
public class Main {
    public static void main(String[] args) {
        // Crear el EntityManagerFactory
        System.out.println("hola");
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad_persistencia");
//        EntityManager em = emf.createEntityManager();

//        try {
//            // Iniciar una transacción
//            em.getTransaction().begin();
//
//            // Crear una dirección
//            Direccion direccion = new Direccion();
//            direccion.setCalle("Av. Principal 123");
//            direccion.setCiudad("Quito");
//            direccion.setCodigoPostal("170901");
//
//            // Crear un alumno y asociarlo con la dirección
//            Alumno alumno = new Alumno();
//            alumno.setNombre("Juan");
//            alumno.setApellido("Perez");
//            alumno.setFechaNacimiento(new Date()); // Fecha actual como ejemplo
//            alumno.setDireccion(direccion);
//
//            // Persistir el alumno (cascada guarda también la dirección)
//            em.persist(alumno);
//
//            // Confirmar la transacción
//            em.getTransaction().commit();
//
//            System.out.println("Alumno y dirección guardados correctamente.");
//        } catch (Exception e) {
//            // Si hay un error, hacer rollback
//            em.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            // Cerrar el EntityManager
//            em.close();
//            emf.close();
//        }
    }
}

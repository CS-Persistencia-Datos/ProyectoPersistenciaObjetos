
package ec.edu.ups.proyectopersistenciaobjetos.unidad2;

import ec.edu.ups.proyectopersistenciaobjetos.unidad4.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;


public class EntityManagerUtil {
public static void main(String[] args) {
    try {
        EntityManager entityManager = ec.edu.ups.proyectopersistenciaobjetos.unidad3.EntityManagerUtil.getEntityManager();
        String nombre = "Diego Cale";
        String jpql = "SELECT c FROM Cliente c WHERE c.nombre = :nombre";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("nombre", nombre);
        Cliente cliente = query.getSingleResult();
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        // Aquí se realiza la carga diferida (Lazy Loading)
        List<ec.edu.ups.proyectopersistenciaobjetos.unidad3.Orden> ordenes = cliente.getOrdenes();
        System.out.println("Órdenes del cliente:");
        for (ec.edu.ups.proyectopersistenciaobjetos.unidad3.Orden orden : ordenes) {
            System.out.println(orden.getDescripcion());
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

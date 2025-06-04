
package ec.edu.ups.proyectopersistenciaobjetos.unidad3;

import ec.edu.ups.proyectopersistenciaobjetos.unidad4.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;


public class EntityManagerUtil {
    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unidad_persistencia");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
    public static void main(String[] args) {
        try {
            EntityManager entityManager = EntityManagerUtil.getEntityManager();
            System.out.println("EntityManager class ==> " + entityManager.getClass().getCanonicalName());
            // Creación de la consulta JPQL
            String nombre="Diego Cale";
            String jpql = "SELECT c FROM Cliente c WHERE c.nombre = :nombre";
            TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
            query.setParameter("nombre", nombre);
            // Ejecución de la consulta y obtención de resultados
            List<Cliente> clientes = query.getResultList();
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getNombre());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Esto imprimirá la traza completa del error
        }
    }
}

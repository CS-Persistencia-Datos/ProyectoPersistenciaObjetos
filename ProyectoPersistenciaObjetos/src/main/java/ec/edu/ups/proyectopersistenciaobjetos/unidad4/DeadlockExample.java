
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();
    public void process1() {
        lock1.lock();
        try {
            lock2.lock();
            try {
                // Operación crítica
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    }
    public void process2() {
        lock2.lock();
        try {
            lock1.lock();
            try {
                // Operación crítica
            } finally {
                lock1.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }
}

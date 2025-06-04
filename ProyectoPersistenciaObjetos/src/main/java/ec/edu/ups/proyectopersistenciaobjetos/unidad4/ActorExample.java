
package ec.edu.ups.proyectopersistenciaobjetos.unidad4;


import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class ActorExample{
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("ActorSystem");
        
        ActorRef actor = system.actorOf(Props.create(HelloActor.class), "helloActor");
        actor.tell("Hola", ActorRef.noSender());
        
        system.terminate();
    }
}

class HelloActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, s -> System.out.println("Mensaje recibido: " + s))
                .build();
    }
}
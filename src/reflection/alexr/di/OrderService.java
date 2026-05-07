package reflection.alexr.di;
//Servicio que usa el repositorio
import reflection.alexr.di.Component;
import reflection.alexr.di.Inject;

@Component
public class OrderService implements Service {

 @Inject
 private Repository repository;

 public void process(String order) {
     System.out.println("🔄 Procesando: " + order);
     repository.save(order);
 }

}
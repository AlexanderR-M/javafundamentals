package reflection.alexr.di;

//Implementación concreta del repositorio
import reflection.alexr.di.Component;

@Component
public class OrderRepository implements Repository {

 public void save(String data) {
     System.out.println("🗄️ Guardando pedido: " + data);
 }

}
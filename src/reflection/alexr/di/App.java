package reflection.alexr.di;

//Clase para ejecutar la demo
public class App {

 public static void main(String[] args) throws Exception {
     Container container = new Container();

     // Registrar beans
     container.register(OrderRepository.class);
     container.register(OrderService.class);

     // Crear e inyectar
     container.initialize();

     // Usar el servicio
     Service service = container.getBean(OrderService.class);
     service.process("Pedido 001");

     System.out.println("🎉 Demo inyección de dependencias con reflexión terminada.");
 }

}
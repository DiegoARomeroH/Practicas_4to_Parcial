import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> pila = new ArrayList<>();
        List<String> cola = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Mostrar datos de la pila o cola");
            System.out.println("3. Mostrar si la pila o cola está vacía");
            System.out.println("4. Mostrar el tamaño de la pila y la cola");
            System.out.println("5. Pick");
            System.out.println("6. Quick");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dato a añadir a la pila:");
                    String elementoPila = scanner.nextLine();
                    pila.add(0, elementoPila);

                    System.out.println("Ingrese el dato a añadir a la cola:");
                    String elementoCola = scanner.nextLine();
                    cola.add(elementoCola);
                    break;
                case 2:
                    System.out.println("Datos de pila: " + pila);
                    System.out.println("Datos de cola: " + cola);
                    break;
                case 3:
                    System.out.println("¿Está vacía la pila?: " + pila.isEmpty());
                    System.out.println("¿Está vacía la cola?: " + cola.isEmpty());
                    break;
                case 4:
                    System.out.println("Tamaño de pila: " + pila.size());
                    System.out.println("Tamaño de cola: " + cola.size());
                    break;
                case 5:
                    System.out.println("Primer elemento de pila (pick): " + pila.get(0));
                    System.out.println("Primer elemento de cola (pick): " + cola.get(0));
                    break;
                case 6:
                    String primerElementoPila = pila.remove(0);
                    String primerElementoCola = cola.remove(0);
                    System.out.println("Primer elemento de pila (quick): " + primerElementoPila);
                    System.out.println("Primer elemento de cola (quick): " + primerElementoCola);
                    break;
                case 7:
                    System.out.println("Salir");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        }
    }
}
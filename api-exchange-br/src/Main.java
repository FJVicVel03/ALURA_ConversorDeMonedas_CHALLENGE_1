
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean continuar = true;
       Convertor conv = new Convertor();

       while(continuar){
           System.out.println("Selecciona una opción: ");
           System.out.println("1. Convertir monedas");
           System.out.println("2. Ver historial de conversiones");
           System.out.println("3. Salir");
           System.out.println("Opción: ");
           int opcion = scanner.nextInt();

           switch (opcion){
               case 1:
                   conversor(scanner, conv);
                   break;
               case 2:
                   System.out.println("Historial de conversiones: ");
                   mostrarHistorial(conv);
                   break;

               case 3:
                     continuar = false;
                     break;
               default:
                     System.out.println("Opción no válida");
           }
       }
        System.out.println("Gracias por usar mi convertor de monedas!!");

    }

    private static void conversor(Scanner scanner, Convertor conv){
        System.out.println("Ingresa moneda desde la que partes (EJ: USD, ARS ...");
        String base = scanner.next().toUpperCase();
        System.out.println("Ingresa la moneda a la que quieras convertir (EJ: USD, ARS ...");
        String objetivo = scanner.next().toUpperCase();
        System.out.println("Ingresa la cantidad de " + base + " que quieres convertir a " + objetivo);
        double cantidad = scanner.nextDouble();
        System.out.println("Convirtiendo " + cantidad + " " + base + " a " + objetivo + "...");
        double resultado = conv.convertirMonedas(base, objetivo, cantidad);
        System.out.println(cantidad + " " + base + " es igual a " + resultado + " " + objetivo);
        System.out.println("\n");
    }

    private static void mostrarHistorial(Convertor conv){
        LinkedList<Historial> historial = conv.obtenerConversiones();
        for(Historial h : historial){
            System.out.println(h);
            System.out.println("\n");
        }
    }
}


import java.util.Scanner;
public class adivineminumero {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Piensa en un número entre 1 y 100 y yo trataré de adivinarlo.");
            System.out.println("Después de cada intento, ingresa < si es menor, > si es mayor o = si adiviné.");
            System.out.print("Presiona Enter cuando estés listo para comenzar...");
            scanner.nextLine();

            int minNumero = 1;
            int maxNumero = 100;
            int intento;

            while (true) {
                intento = (minNumero + maxNumero) / 2;
                System.out.println("¿Es " + intento + " tu número? (<, >, =): ");
                String respuesta = scanner.nextLine();

                if (respuesta.equals(">")) {
                    minNumero = intento + 1;
                } else if (respuesta.equals("<")) {
                    maxNumero = intento - 1;
                } else if (respuesta.equals("=")) {
                    System.out.println(" He adivinado tu número.");
                    break;
                } else {
                    System.out.println("Por favor, ingresa <, > o =.");
                }
            }

            scanner.close();
        }
    }




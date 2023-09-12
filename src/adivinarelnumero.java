import java.util.Random;
import java.util.Scanner;

public class adivinarelnumero {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
            int intentos = 0;

            System.out.println("¡Bienvenido a Adivina el Número!");
            System.out.println("Estoy pensando en un número entre 1 y 100.");

            while (true) {
                intentos++;
                System.out.print("Intento #" + intentos + ": ");
                int intentoUsuario = scanner.nextInt();

                if (intentoUsuario < numeroSecreto) {
                    System.out.println("El número pensado es mayor.");
                } else if (intentoUsuario > numeroSecreto) {
                    System.out.println("El número pensado es menor.");
                } else {
                    System.out.println("¡Correcto! ¡Has adivinado el número en " + intentos + " intentos!");
                    break;
                }
            }

            scanner.close();
        }
    }



import java.util.Scanner;
public class numeroinverso {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número natural: ");
            int numero = scanner.nextInt();

            int original = numero;
            int invertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero /= 10;
            }

            if (original == invertido) {
                System.out.println(original + " es un palíndromo.");
            } else {
                System.out.println(original + " no es un palíndromo.");
            }

            scanner.close();
        }
    }




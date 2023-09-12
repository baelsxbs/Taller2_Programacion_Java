 import java.util.Scanner;

    public class histograma {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int valoresPositivos = 0;
            int valoresNegativos = 0;

            while (true) {
                System.out.print("Ingrese un valor entero (0 para salir): ");
                int valor = scanner.nextInt();

                if (valor > 0) {
                    valoresPositivos++;
                } else if (valor < 0) {
                    valoresNegativos++;
                } else if (valor == 0) {
                    break;
                }
            }

            System.out.println("Gráfico:");
            for (int i = 0; i < valoresPositivos; i++) {
                System.out.print("*");
            }
            System.out.println(" (Valores positivos)");

            for (int i = 0; i < valoresNegativos; i++) {
                System.out.print("*");
            }
            System.out.println(" (Valores negativos)");

            scanner.close();
        }
    }



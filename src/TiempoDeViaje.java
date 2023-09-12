import java.util.Scanner;

public class TiempoDeViaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMinutos = 0;

        while (true) {
            System.out.print("Ingrese el tiempo del tramo (en minutos), o 0 para terminar: ");
            int tiempoTramo = scanner.nextInt();

            if (tiempoTramo == 0) {
                break;
            }

            totalMinutos += tiempoTramo;
        }

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("El tiempo total del viaje es: " + horas + " horas y " + minutos + " minutos.");
    }
}




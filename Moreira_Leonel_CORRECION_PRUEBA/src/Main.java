import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dron[] drones = new Dron[3];

        for (int i = 0; i < drones.length; i++) {

            System.out.println("\n=== INGRESO DE DRON " + (i + 1) + " ===");

            System.out.print("Tipo de dron (1=Liviano, 2=Carga, 3=Emergencia): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Distancia (km): ");
            double distancia = sc.nextDouble();

            System.out.print("Peso paquete (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Horas de vuelo: ");
            double horas = sc.nextDouble();

            if (tipo == 1) {
                drones[i] = new DronLiviano(codigo, modelo, distancia, peso, horas);
            } else if (tipo == 2) {
                drones[i] = new DronCarga(codigo, modelo, distancia, peso, horas);
            } else if (tipo == 3) {
                drones[i] = new DronEmergencia(codigo, modelo, distancia, peso, horas);
            } else {
                System.out.println("Tipo inválido, se asigna Dron Liviano por defecto.");
                drones[i] = new DronLiviano(codigo, modelo, distancia, peso, horas);
            }
        }

        System.out.println("\n=== RESULTADOS ===");

        for (Dron d : drones) {

            if (d.validarDatos()) {
                d.mostrarInformacion();
                System.out.println("Costo final: $" + d.calcularCostoEntrega());
            } else {
                System.out.println("Datos inválidos para el dron: " + d.getCodigo());
            }

            System.out.println("------------------------");
        }

        sc.close();
    }
}
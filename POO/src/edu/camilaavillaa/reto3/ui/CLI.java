package edu.camilaavillaa.reto3.ui;
import edu.camilaavillaa.reto3.process.conversiones;
import java.util.Scanner;


    public class CLI {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            showMenu();
        }

        public static void showMenu() {
            conversiones conversion = new conversiones();

            System.out.println("Bienvenido al programa de conversiones entre bases numéricas");

            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Convertir de decimal a binario.");
                System.out.println("2. Convertir de decimal a octal.");
                System.out.println("3. Convertir de binario a decimal.");
                System.out.println("4. Convertir de octal a decimal.");
                System.out.println("5. Convertir de hexadecimal a decimal.");
                System.out.println("6. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        conversiones.convertirDecimalABinario();
                        break;
                    case 2:
                        conversiones.convertirDecimalAOctal();
                        break;
                    case 3:
                        conversiones.convertirBinarioADecimal();
                        break;
                    case 4:
                        conversiones.convertirOctalADecimal();
                        break;
                    case 5:
                        conversiones.convertirHexadecimalADecimal();
                        break;
                    case 6:
                        System.out.println("Gracias por usar el programa de conversiones. ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        }
    }


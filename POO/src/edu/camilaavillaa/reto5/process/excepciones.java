package edu.camilaavillaa.reto5.process;
import java.util.Scanner;
public class excepciones {
    public static void Facil() {
        String[] palabraFacil = {"g", "a", "t", "o"};
        boolean[] letrasAdivinadas = new boolean[palabraFacil.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar la palabra Nivel: Facil palabra(4 letras)!");

        while (true) {
            System.out.print("Adivina una letra o ingresa '0' para salir: ");
            String input = scanner.next();

            if (input.equals("0")) {
                break;
            }

            if (input.length() != 1) {
                System.out.println("Ingresa una sola letra.");
                continue;
            }

            String letra = input.toLowerCase();

            boolean acierto = false;

            for (int recorrido = 0; recorrido < palabraFacil.length; recorrido++) {
                if (!letrasAdivinadas[recorrido] && palabraFacil[recorrido].equalsIgnoreCase(letra)) {
                    letrasAdivinadas[recorrido] = true;
                    acierto = true;
                    System.out.println("¡Adivinaste la letra '" + letra + "' en la posición " + recorrido);
                }
            }

            if (!acierto) {
                System.out.println("Letra incorrecta. Inténtalo de nuevo.");
            }

            boolean palabraCompleta = true;
            for (boolean adivinada : letrasAdivinadas) {
                if (!adivinada) {
                    palabraCompleta = false;
                    break;
                }
            }

            if (palabraCompleta) {
                System.out.println("¡Felicidades! Has adivinado la palabra correctamente.");
                break;
            }
        }

        scanner.close();
    }
    public static void Intermedio() {
        String[] palabraIntermadia = {"s", "i", "l", "e","n","c","i","o"};
        boolean[] letrasAdivinadas = new boolean[palabraIntermadia.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar la palabra Nivel:Intermedio (palabra 8 letras)!");

        while (true) {
            System.out.print("Adivina una letra o ingresa '0' para salir: ");
            String input = scanner.next();

            if (input.equals("0")) {
                break;
            }

            if (input.length() != 1) {
                System.out.println("Ingresa una sola letra.");
                continue;
            }

            String letra = input.toLowerCase();

            boolean acierto = false;

            for (int recorrido = 0; recorrido < palabraIntermadia.length; recorrido++) {
                if (!letrasAdivinadas[recorrido] && palabraIntermadia[recorrido].equalsIgnoreCase(letra)) {
                    letrasAdivinadas[recorrido] = true;
                    acierto = true;
                    System.out.println("¡Adivinaste la letra '" + letra + "' en la posición " + recorrido);
                }
            }

            if (!acierto) {
                System.out.println("Letra incorrecta. Inténtalo de nuevo.");
            }

            boolean palabraCompleta = true;
            for (boolean adivinada : letrasAdivinadas) {
                if (!adivinada) {
                    palabraCompleta = false;
                    break;
                }
            }

            if (palabraCompleta) {
                System.out.println("¡Felicidades! Has adivinado la palabra correctamente.");
                break;
            }
        }

        scanner.close();
    }

    public static void Dificil() {
        String[] palabraDificil = {"e", "s", "p", "e","c","t","a","c","u","l","o","s"};
        boolean[] letrasAdivinadas = new boolean[palabraDificil.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar la palabra Nivel:Dificil (palabra: 12 letras)!");

        while (true) {
            System.out.print("Adivina una letra o ingresa '0' para salir: ");
            String input = scanner.next();

            if (input.equals("0")) {
                break;
            }

            if (input.length() != 1) {
                System.out.println("Ingresa una sola letra.");
                continue;
            }

            String letra = input.toLowerCase();

            boolean acierto = false;

            for (int recorrido = 0; recorrido < palabraDificil.length; recorrido++) {
                if (!letrasAdivinadas[recorrido] && palabraDificil[recorrido].equalsIgnoreCase(letra)) {
                    letrasAdivinadas[recorrido] = true;
                    acierto = true;
                    System.out.println("¡Adivinaste la letra '" + letra + "' en la posición " + recorrido);
                }
            }

            if (!acierto) {
                System.out.println("Letra incorrecta. Inténtalo de nuevo.");
            }

            boolean palabraCompleta = true;
            for (boolean adivinada : letrasAdivinadas) {
                if (!adivinada) {
                    palabraCompleta = false;
                    break;
                }
            }

            if (palabraCompleta) {
                System.out.println("¡Felicidades! Has adivinado la palabra correctamente.");
                break;
            }
        }

        scanner.close();
    }

}


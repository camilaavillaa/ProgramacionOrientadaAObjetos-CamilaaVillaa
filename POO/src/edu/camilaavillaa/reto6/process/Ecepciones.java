package edu.camilaavillaa.reto6.process;

import java.util.Scanner;
public class Excepciones {

    public static void Dificil() {
        String[] palabraDificil = {"a", "f", "r", "i", "c", "a", "n", "i", "s", "m", "o", "s"};
        boolean[] letrasAdivinadas = new boolean[palabraDificil.length];
        System.out.println("¡Bienvenido al juego de adivinar la palabra Nivel:Dificil (palabra: 12 letras)!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar la palabra Nivel: Dificil (palabra: 12 letras)!");

        while (true) {
            try {
                @@ -161,9 +163,9 @@ public static void Dificil() {
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                scanner.close();

            }

            scanner.close(); // Este cierre de scanner debe estar fuera del while
        }

    }
}
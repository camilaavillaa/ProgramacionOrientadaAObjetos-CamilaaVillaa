package edu.camilaavillaa.reto5.ui;

import java.util.Scanner;

    public class CLI {
        public static void showMenu(){
            Scanner scanner =new Scanner (System.in);
            System.out.println("Elige la dificultad que quieras jugar");
            System.out.println("1: Facil");
            System.out.println("2: intermedio");
            System.out.println("3: Dificil");
            int Nivel = scanner.nextInt();

            switch (Nivel) {
                case 1:
                    edu.camilaavillaa.reto5.process.excepciones.Facil();
                    break;
                case 2:
                    edu.camilaavillaa.reto5.process.excepciones.Intermedio();
                    break;
                case 3:
                    edu.camilaavillaa.reto5.process.excepciones.Dificil();
                    break;
                default:
                    System.out.println("esa opcion no existe");
            }
        }
    }
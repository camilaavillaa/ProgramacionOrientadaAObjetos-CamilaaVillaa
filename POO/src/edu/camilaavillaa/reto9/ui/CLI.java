package edu.camilaavillaa.reto9.ui;

public class CLI {

import edu.camilaavillaa.reto9.process.ayudante;


        public static class Main {
            public static void main(String[] args) {
                // Crear cinco ayudantes
                ayudante[] ayudantes = new ayudante[5];
                for (int i = 0; i < ayudantes.length; i++) {
                    ayudantes[i] = new ayudante();
                }

                // Imprimir la lista de ayudantes con sus características
                for (int i = 0; i < ayudantes.length; i++) {
                    System.out.println("Ayudante " + (i + 1) + ": " + ayudantes[i]);
                }
            }
        }
    }
}

package edu.camilaavillaa.reto9.ui;

public class Main {
    public static void main(String[] args) {
        // Crear cinco ayudantes
        Ayudante[] ayudantes = new Ayudante[5];
        for (int i = 0; i < ayudantes.length; i++) {
            ayudantes[i] = new Ayudante();
        }

        // Imprimir la lista de ayudantes con sus características
        for (int i = 0; i < ayudantes.length; i++) {
            System.out.println("Ayudante " + (i + 1) + ": " + ayudantes[i]);
        }
    }
}


package edu.camilaavillaa.reto10.ui;

import edu.camilaavillaa.reto10.process.Division;
import edu.camilaavillaa.reto10.process.Raiz;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Raiz raizEntero = new Raiz() {
            @Override
            public double calcularRaizCuadrada(double numero) {
                return 0;
            }
        };
        Raiz raizDouble = new Raiz() {
            @Override
            protected double calcularRaizCuadrada(double numero) {
                return 0;
            }
        };


        int numeroEntero = 16;
        double numeroDouble = 25.0;

        System.out.println("Raíz cuadrada de " + numeroEntero + ": " + raizEntero.calcularRaiz(numeroEntero));
        PrintStream printf = System.out.printf("El resultado de esta raiz", numeroDouble, raizDouble.calcularRaiz((int) numeroDouble));
    }
}



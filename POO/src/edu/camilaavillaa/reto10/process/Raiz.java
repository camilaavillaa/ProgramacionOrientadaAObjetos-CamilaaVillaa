package edu.camilaavillaa.reto10.process;

public abstract class Raiz {
    public abstract double calcularRaiz(double numero);

    public double calcularRaiz(int numeroEntero) {
        return calcularRaiz((double) numeroEntero);
    }
}

class RaizCuadradaEntero extends Raiz {
    @Override
    public double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
}

class RaizDouble extends Raiz {
    @Override
    public double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
}
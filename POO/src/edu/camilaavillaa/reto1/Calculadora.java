package edu.camilaavillaa.reto1;

/**
 * @author camilaavilaa
 * Esta clase contiene la logica de las operaciones aritmeticas básicas, suma, resta, multiplicación y divición
 */

public class Calculadora {
    /**
     *
     * @param num1 primer operado de la suma
     * @param num2 segundo operado de la suma
     * @return resultado de la num1 y num2
     *
     * Este metodo sirve para sumar dos numeros enteros
     */
    public static int sumaEnteros(int num1,int num2){
        return num1 + num2;
    }
    public static int RestaEnteros(int num1,int num2){
        return num1 - num2;
    }
    public static int MultiplicacionEnteros(int num1,int num2){
        return num1 * num2;
    }
    public static int DivisionEnteros(int num1,int num2){
        return num1 / num2;
    }
    public static int ModuloEnteros(int num1,int num2){
        return num1 / num2;
    }
}

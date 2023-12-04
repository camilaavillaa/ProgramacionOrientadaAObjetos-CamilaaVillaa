package edu.camilaavillaa.reto12.process;

/**
 * La clase Modulo extiende la clase Resta y representa una operación de módulo entre dos números.
 */
public class Modulo extends Resta{
    /**
     * Calcula el resultado del módulo entre dos números.
     *
     * Usanddo un override
     */
    @Override
    public double calcular(double num1, double num2) {
        if (num2 != 0) {
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
            }
            return num1;
        } else {
            System.out.println("Error: Módulo por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación .
     */
    @Override
    public String getSimbolo() {
        return "%";
    }
}


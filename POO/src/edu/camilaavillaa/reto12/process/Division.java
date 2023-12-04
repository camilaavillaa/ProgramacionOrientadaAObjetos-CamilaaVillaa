package edu.camilaavillaa.reto12.process;

/**
 * Division extiende la clase Resta y representa una operación de división entre dos números.
 */
public class Division  extends Resta{
    /**
     * Calcula el resultado de la división entre dos números.
     */
    @Override
    public double calcular(double num1, double num2) {

        if (num2 != 0) {
            double resultado = 0;
            while (num1 >= num2) {
                num1 = super.calcular(num1, num2);
                resultado++;
            }
            return resultado;
        } else {
            System.out.println("Error: División por cero");
            return 0;
        }
    }
    /**
     * Obtiene el símbolo representativo de la operación de división.
     */
    @Override
    public String getSimbolo() {
        return "/";
    }

}


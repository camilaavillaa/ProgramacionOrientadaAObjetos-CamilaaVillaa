package edu.camilaavillaa.reto11.process;

public class Suma extends OperacionAritmetica {
    /**
     * Clase que representa la operación de suma.
     */

        /**
         * Realiza una operación de suma entre dos números usando un override y
         * obtiene el símbolo representativo de la operación de suma usando un override
        /**

         */
        @Override
        public double calcular(double num1, double num2) {
            return num1 + num2;
        }

        public String getSimbolo() {
            return "+";
        }

    }


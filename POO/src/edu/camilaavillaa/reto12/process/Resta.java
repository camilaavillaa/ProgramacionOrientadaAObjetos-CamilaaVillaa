package edu.camilaavillaa.reto12.process;

public class Resta extends OperacionAritmetica{


    /**
     * Clase que representa la operación de la resta
     */

        @Override
        public double calcular(double num1, double num2) {
            return num1 - num2;
        }
        /**
         * Obtiene el símbolo representativo de la operación de resta.
         */
        @Override
        public String getSimbolo() {
            return "-";
        }
    }


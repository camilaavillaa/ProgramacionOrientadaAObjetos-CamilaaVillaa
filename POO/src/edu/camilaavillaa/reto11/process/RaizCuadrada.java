package edu.camilaavillaa.reto11.process;


    /**
     * La clase RaizCuadrada extiende la clase OperacionesAritmeticas y representa una operación de raíz cuadrada.
     */
    public class RaizCuadrada extends OperacionAritmetica{
        /**
         * Calcula la raíz cuadrada de dos números.
         */
        @Override
        public double calcular(double num1, double num2) {
            double raizNum1 = Math.sqrt(num1);

            return  raizNum1;
        }
        /**
         * Obtiene el símbolo representativo de la operación.
         */

        @Override
        public String getSimbolo() {
            return "sqrt";
        }
    }


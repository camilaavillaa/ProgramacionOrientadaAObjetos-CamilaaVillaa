package edu.camilaavillaa.reto12.process;


    /**
     * La clase Potencia extiende la clase Multiplicacion y representa una operación de potenciación.
     */
    public class Potencia extends Multiplicacion{
        /**
         * Calcula el resultado de elevar un número a una potencia dada.
         */
        @Override
        public double calcular(double num1, double num2) {
            // Utilizando Multiplicacion para calcular la Potencia
            double resultado = 1;
            for (int i = 0; i < num2; i++) {
                resultado = super.calcular(resultado,num2);
            }
            return resultado;
        }
        /**
         * Obtiene el símbolo representativo de la operación.
         *
         * @return Cadena de texto que representa el símbolo de la potencia, que es el signo "^".
         */
        @Override
        public String getSimbolo() {
            return "^";
        }

    }


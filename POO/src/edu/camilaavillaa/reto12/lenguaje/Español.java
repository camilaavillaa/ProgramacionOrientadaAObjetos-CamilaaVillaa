package edu.camilaavillaa.reto12.lenguaje;

public class Español implements Lenguaje{

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Bienvenido a la Calculadora";
            case "select_option":
                return "Selecciona una opcion";
            case "invalid_option":
                return "Opcion invalida, intentelo de nuevo";
            case "continue":
                return "Desea continuar (s/n)?: ";
            case "exit":
                return "Saliendo...";
            case "enter_first_number":
                return "Inserte primer numero";
            case "enter_second_number":
                return "Inserte segundo numero";
            case "enter_raiz":
                return "Ingresa el numero base para la raiz";
            case "enter_base":
                return "Dame el numero que e sacaremos raiz:";
            case "enter_exponent":
                return "Ingresa el exponente";
            case "enter_dividend":
                return "Ingresa dividendo:";
            case "enter_divisor":
                return "Ingresa el divisor:";
            case "enter_modulo_number":
                return "Ingresa el numero para el calculo del modulo";
            case "enter_modulo_divisor":
                return "Ingresa el divisor para el calculo del modulo";
            case "enter_logarithm_number":
                return "Ingresa el numero para el logaritmo: ";
            case "enter_logarithm_base":
                return "Ingresa la base del logaritmo";
            case "result":
                return "Resultado:";
            case "menu":
                return "Menu: \n1 Suma\n2 Resta\n3 Multiplicacion\n4 Potencia\n5 Division\n6 Modulo\n7 Logaritmo\n8 Raiz Cuadrada\n0 Salir\nS";
            case "operation_description":
                return "Operacion:";
            case "is":
                return "es";
            case "Adding":
                return "Sumando";
            case "Subtracting":
                return "Restando";
            case "Dividing":
                return "Dividiendo";
            case  "Multiplying":
                return "Multiplicando";
            case "Calculating the modulus of":
                return "Calculando el modulo de: ";
            case "Calculating the logarithm of: ":
                return  "Calculando el logaritmo de: ";
            case "Raising":
                return "Elevando: ";
            case "Calculating the square root of: ":
                return "Calculando la raiz cuadrada de: ";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "¿Desea ver las operaciones aritméticas realizadas hasta ahora? (s/S)";

            default:
                return "Mensaje no encontrado";
        }
    }}



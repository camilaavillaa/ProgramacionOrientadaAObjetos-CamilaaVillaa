package edu.camilaavillaa.reto12.lenguaje;

public class English implements Lenguaje {

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "Bienvenido":
                return "Welcome to the Calculator";
            case "Selecciona_una_opcion":
                return "Select an option";
            case "opcion_invalida":
                return "Invalid option, please try again";
            case "Continuar":
                return "Do you want to continue (y/n)?: ";
            case "Salir":
                return "Exiting...";
            case "Ingresa_primer_numero":
                return "Enter the first number";
            case "Ingresa_segundo_numero":
                return "Enter the second number";
            case "Ingresa_raiz":
                return "Enter the base number for the square root";
            case "Ingresa_base":
                return "Enter the number from which we will calculate the square root:";
            case "Ingresa_exponente":
                return "Enter the exponent";
            case "Ingresa_dividendo":
                return "Enter the dividend:";
            case "Ingresa_divisor":
                return "Enter the divisor:";
            case "Ingresa_el_numero_para_el_calculo_de_modulo":
                return "Enter the number for modulo calculation";
            case "Ingresa_el_divisor_para_el_calculo_de_modulo":
                return "Enter the divisor for modulo calculation";
            case "Ingresa_el_numero_del_logaritmo":
                return "Enter the number for logarithm: ";
            case "Ingresa_la_base_del_logaritmo":
                return "Enter the logarithm base";
            case "Resultado":
                return "Result:";
            case "menu":
                return "Menu: \n1 Addition\n2 Subtraction\n3 Multiplication\n4 Power\n5 Division\n6 Modulo\n7 Logarithm\n8 Square Root\n0 Exit\nS";
            case "operation_description":
                return "Operation:";
            case "is":
                return "is";
            case "Adding":
                return "Adding";
            case "Subtracting":
                return "Subtracting";
            case "Dividing":
                return "Dividing";
            case  "Multiplying":
                return "Multiplying";
            case "Calculating the modulus of":
                return "Calculating the modulus of";
            case "Calculating the logarithm of: ":
                return  "Calculating the logarithm of:  ";
            case "Raising":
                return "Raising: ";
            case "Calculating the square root of: ":
                return "Calculating the square root of: ";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "Do you want to see the arithmetic operations performed so far? (y/n):";

            default:
                return "Message not found";
        }
    }
}


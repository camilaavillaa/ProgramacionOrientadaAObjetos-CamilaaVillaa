package edu.camilaavillaa.reto1.ui;

import edu.camilaavillaa.reto1.Calculadora;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una operacion");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        int opcionMenu = scanner.nextInt();

        System.out.println("introduce date 1");
        int num1 = scanner.nextInt();
        System.out.println("introduce date 2");
        int num2 = scanner. nextInt();

        switch(opcionMenu){
            case 1:
                System.out.println(num1 + " + "+num2+" = "+ Calculadora.sumaEnteros(num1,num2));
                break;
            case 2:
                System.out.println(num1 + " - "+num2+" = "+ Calculadora.sumaEnteros(num1,num2));
                break;
            case 3:
                System.out.println(num1 + " * "+num2+" = "+ Calculadora.sumaEnteros(num1,num2));
                break;
            case 4:
                System.out.println(num1 + " / "+num2+" = "+ Calculadora.sumaEnteros(num1,num2));
                break;
            case 5:
                break;
            default:
                System.out.println("esa opcion no existe");
        }
    }
}


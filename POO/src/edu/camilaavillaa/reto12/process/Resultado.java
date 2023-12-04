package edu.camilaavillaa.reto12.process;

import edu.camilaavillaa.reto12.lenguaje.LanguageFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Resultado {
    private OperacionAritmetica operacion;
    private double num1;
    private double num2;

    public Resultado(OperacionAritmetica operacion, double num1, double num2) {
        this.operacion = operacion;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double obtenerResultado() {
        return operacion.calcular(num1, num2);
    }

    public String obtenerMensaje() {
        String simbolo = operacion.getSimbolo();
        String operacionStr = obtenerDescripcionOperacion(simbolo);
        String mensaje = String.format("%s, %s, %s, %s, %s, %s%n",
                operacionStr,
                num1,
                simbolo,
                num2,
                LanguageFactory.getMessage("is"),
                obtenerResultado());

        Path path = Paths.get("operacion.txt.txt");

        try {

            Files.write(path, mensaje.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mensaje;
    }


    private String obtenerDescripcionOperacion(String simbolo) {
        switch (simbolo) {
            case "+":
                return LanguageFactory.getMessage("Adding");
            case "-":
                return LanguageFactory.getMessage("Subtracting");
            case "*":
                return LanguageFactory.getMessage("Multiplying");
            case "/":
                return LanguageFactory.getMessage("Dividing");
            case "%":
                return LanguageFactory.getMessage("Calculating the modulus of");
            case "log":
                return LanguageFactory.getMessage("Calculating the logarithm of: ");
            case "^":
                return LanguageFactory.getMessage("Raising");
            case "sqrt":
                return LanguageFactory.getMessage("Calculating the square root of: ");
            default:
                return "Realizando operación";
        }
    }

}


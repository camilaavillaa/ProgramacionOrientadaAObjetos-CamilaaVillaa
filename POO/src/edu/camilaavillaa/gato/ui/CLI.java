package edu.camilaavillaa.gato.ui;

import edu.camilaavillaa.gato.game.*;
import edu.camilaavillaa.gato.ui.Idioma.LenguajeFactory;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * La clase `CLI` representa la interfaz de línea de comandos para la ejecución del juego.
 * Proporciona métodos para iniciar y gestionar el juego mediante interacciones con el usuario a través de la consola.
 */
public class CLI {
    /**
     * Inicia el juego y gestiona las interacciones con el usuario a través de la interfaz de línea de comandos.
     */
    public static void  startGame (){
        ScoreManager scoreManager = new ScoreManager();
        Scanner scanner = new Scanner(System.in);
        int idiomaSeleccionado=0;
        int boardSize = 0;
        int boardSizeChoize;
        /** // Selección del idioma */
        while (true) {
            try {
                System.out.println("Seleccione el idioma (Select the language):");
                System.out.println("1. Español");
                System.out.println("2. English");

                idiomaSeleccionado = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido para seleccionar el idioma.");
                scanner.next();
            }
        }
        LenguajeFactory.setLanguage(idiomaSeleccionado);

        while (true) {
            while (true) {
                try {
                    /** Selección del modo de juego */
                    System.out.println(LenguajeFactory.getMensaje("board_size"));
                    System.out.println("1. 3x3");
                    System.out.println("2. 4x4");
                    System.out.println(LenguajeFactory.getMensaje("option"));

                    /** Configuración de jugadores según el modo de juego */
                    boardSize = scanner.nextInt();
                    if (boardSize == 1 || boardSize == 2) {
                        break;
                    } else {
                        System.out.println("Por favor, seleccione una opción válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido para seleccionar el tamaño del tablero.");
                    scanner.next();
                }
            }

            /** Inicialización del juego y ejecución*/
            if (boardSize == 1) {
                boardSizeChoize= 3;
            } else {
                boardSizeChoize= 4;
            }

            System.out.println(LenguajeFactory.getMensaje("play_mode"));
            System.out.println( LenguajeFactory.getMensaje("human"));
            System.out.println( LenguajeFactory.getMensaje("AI"));
            System.out.println(LenguajeFactory.getMensaje("option"));

            int gameModeChoice = scanner.nextInt();

            Player player1, player2;

            if (gameModeChoice == 1) {
                System.out.println(LenguajeFactory.getMensaje("player1_name"));
                scanner.nextLine();
                String player1Name = scanner.nextLine();
                player1 = new Player(player1Name, 'X');

                System.out.println(LenguajeFactory.getMensaje("player2_name"));
                String player2Name = scanner.nextLine();
                player2 = new Player(player2Name, 'O');
            } else {
                System.out.println(LenguajeFactory.getMensaje("enter_name"));
                scanner.nextLine();
                String playerName = scanner.nextLine();
                player1 = new Player(playerName, 'X');
                player2 = new AIPlayer('O');
            }

            Board board = new Board(boardSizeChoize);
            LogicGame game = new LogicGame(player1, player2, board);
            game.play();
/** Actualización y visualización de puntajes y rankings*/
            scoreManager.updateScores(player1, player2);
            scoreManager.saveScoresToFile();
            scoreManager.displayRankings();
/** Pregunta si desea jugar nuevamente*/
            System.out.println("Scores:");
            scoreManager.displayScores();

            System.out.println(LenguajeFactory.getMensaje("loop"));
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
package edu.camilaavillaa.gato.game;

/**
 * La clase Board representa el tablero del juego.
 * Contiene la representación visual del tablero, métodos para gestionar y verificar el estado del tablero.
 */
public class Board {
    private char[][] grid;
    /**
     * Constructor de Board que inicializa el tablero con un tamaño específico.
     *
     * @param size Tamaño del tablero (size x size)
     */
    public Board(int size) {
        grid = new char[size][size];
        initializeBoard();
    }
    /**
     * Inicializa el tablero con valores predeterminados ('-') para cada celda.
     */
    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '-';
            }
        }
    }
    /**
     * Muestra visualmente el tablero en la consola.
     */
    public void display() {
        System.out.print("  ");
        for (int i = 1; i <= grid.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                if (j < grid[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            if (i < grid.length - 1) {
                System.out.print("  ");
                for (int k = 0; k < grid.length * 4 - 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }

        System.out.println();
    }

    /**
     * Verifica si una celda específica en el tablero está ocupada.
     *
     * @param row Fila de la celda
     * @param col Columna de la celda
     * @return true si la celda está ocupada, false si está vacía
     */
    public boolean isCellOccupied(int row, int col) {
        return grid[row][col] != '-';
    }
    /**
     * Marca una celda específica en el tablero con el símbolo proporcionado.
     *
     * @param row    Fila de la celda a marcar
     * @param col    Columna de la celda a marcar
     * @param symbol Símbolo a colocar en la celda
     */
    public void markCell(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

    /**
     * Verifica si el tablero está lleno, es decir, todas las celdas están ocupadas.
     *
     * @return true si el tablero está lleno, false si aún hay celdas vacías
     */
    public boolean isFull() {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Verifica si hay un ganador en el juego basado en el símbolo proporcionado.
     *
     * @param symbol Símbolo a verificar para determinar si hay un ganador
     * @return true si hay un ganador, false si no lo hay
     */
    public boolean isWinner(char symbol) {
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == symbol) {
                    count++;
                    if (count == grid.length) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        for (int j = 0; j < grid.length; j++) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == symbol) {
                    count++;
                    if (count == grid.length) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == symbol) {
                count++;
                if (count == grid.length) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][grid.length - 1 - i] == symbol) {
                count++;
                if (count == grid.length) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
    /**
     * Obtiene el tamaño del tablero.
     *
     * @return Tamaño del tablero (número de filas/columnas)
     */
    public int getSize() {
        return grid.length;
    }
}
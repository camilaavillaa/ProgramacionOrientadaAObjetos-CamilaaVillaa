package edu.camilaavillaa.retofinal.game;

public class Board {
    private char[][] grid;

    public Board(int size) {
        grid = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '-';
            }
        }
    }

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

    public boolean isCellOccupied(int row, int col) {
        return grid[row][col] != '-';
    }

    public void markCell(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

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

    public int getSize() {
        return grid.length;
    }
}

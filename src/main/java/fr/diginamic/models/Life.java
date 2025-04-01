package fr.diginamic.models;

import static fr.diginamic.GameOfLife.ALIVE;

public class Life {

    private static int countAliveNeighbors(Matrix board, int x, int y) {
        int count = 0;
        // Check all 8 neighbors
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0)
                    continue; // Skip the cell itself

                int newX = x + i;
                int newY = y + j;

                // Check bounds
                if (newX >= 0 && newX < board.getRows() &&
                        newY >= 0 && newY < board.getCols()) {
                    if (ALIVE.equals(board.getCell(newX, newY))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static boolean isAlive(Matrix board, int x, int y) {
        int neighbors = countAliveNeighbors(board, x, y);
        return neighbors == 2 || neighbors == 3;
    }

    public static boolean isDead(Matrix board, int x, int y) {
        int neighbors = countAliveNeighbors(board, x, y);
        return neighbors < 2 || neighbors > 3;
    }


    public static boolean isBorn(Matrix board, int x, int y) {
        int neighbors = countAliveNeighbors(board, x, y);
        return neighbors == 3;
    }
}
package fr.diginamic.models;

import java.util.Arrays;

public class Matrix {
    private String[][] matrix;

    // Constructor to create matrix with given dimensions
    public Matrix(int rows, int cols) {
        this.matrix = new String[rows][cols];
    }

    public void setCell(String lifeState, int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
            matrix[x][y] = lifeState;
        }
    }

    public String getCell(int x, int y) {
        return matrix[x][y];
    }

    public int getRows() {
        return matrix.length;
    }

    public int getCols() {
        return matrix[0].length;
    }
}
package fr.diginamic.lifeforms;

import fr.diginamic.models.Matrix;

import java.util.Scanner;

import static fr.diginamic.GameOfLife.ALIVE;
import static fr.diginamic.GameOfLife.DEAD;

public class Blinker extends Lifeforms
{
    @Override
    public void generate(Matrix board, Scanner scanner)
    {
        int centerX = board.getRows() / 2;
        int centerY = board.getCols() / 2;

        // Create the blinker shape
        board.setCell(ALIVE, centerX, centerY); // Center cell
        board.setCell(ALIVE, centerX, centerY + 1); // Right of center
        board.setCell(ALIVE, centerX, centerY -1); // left of center

    }
}
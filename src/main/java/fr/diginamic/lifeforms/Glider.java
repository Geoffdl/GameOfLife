package fr.diginamic.lifeforms;

import fr.diginamic.models.Life;
import fr.diginamic.models.Matrix;

import java.util.Scanner;

import static fr.diginamic.GameOfLife.ALIVE;
import static fr.diginamic.GameOfLife.DEAD;

public class Glider extends Lifeforms
{

    @Override
    public void generate(Matrix board, Scanner scanner)
    {
        int centerX = board.getRows() / 2;
        int centerY = board.getCols() / 2;

        // Create the glider shape
        board.setCell(DEAD, centerX, centerY); // Center cell
        board.setCell(ALIVE, centerX, centerY + 1); // Right of center
        board.setCell(DEAD, centerX + 1, centerY); // Below center
        board.setCell(ALIVE, centerX + 1, centerY + 2); // Two right, one down
        board.setCell(ALIVE, centerX + 2, centerY); // Two down
        board.setCell(ALIVE, centerX + 2, centerY + 1); // Two down, one right
        board.setCell(ALIVE, centerX + 2, centerY + 2); // Two down, two right
    }
}
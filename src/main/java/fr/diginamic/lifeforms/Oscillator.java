package fr.diginamic.lifeforms;

import fr.diginamic.models.Matrix;

import java.util.Scanner;

import static fr.diginamic.GameOfLife.ALIVE;

public class Oscillator extends Lifeforms
{
    @Override
    public void generate(Matrix board, Scanner scanner)
    {
        int centerX = board.getRows() / 2;
        int centerY = board.getCols() / 2;

        // Create an oscillator shape

        board.setCell(ALIVE, centerX, centerY); // Center cell
        // left
        board.setCell(ALIVE, centerX - 1, centerY);

        board.setCell(ALIVE, centerX - 2, centerY + 1);
        board.setCell(ALIVE, centerX - 2, centerY);
        board.setCell(ALIVE, centerX - 2, centerY - 1);

        board.setCell(ALIVE, centerX - 5, centerY + 1);
        board.setCell(ALIVE, centerX - 5, centerY);
        board.setCell(ALIVE, centerX - 5, centerY - 1);
        board.setCell(ALIVE, centerX - 6, centerY);
        board.setCell(ALIVE, centerX - 7, centerY);

        //right
        board.setCell(ALIVE, centerX+1, centerY);
        board.setCell(ALIVE, centerX+2, centerY);

        board.setCell(ALIVE, centerX+3, centerY+1);
        board.setCell(ALIVE, centerX+3, centerY);
        board.setCell(ALIVE, centerX+3, centerY-1);

        board.setCell(ALIVE, centerX+6, centerY+1);
        board.setCell(ALIVE, centerX+6, centerY);
        board.setCell(ALIVE, centerX+6, centerY-1);
        board.setCell(ALIVE, centerX+7, centerY);
        board.setCell(ALIVE, centerX+8, centerY);

    }
}
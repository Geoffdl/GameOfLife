package fr.diginamic.utils;

import fr.diginamic.GameOfLife;
import fr.diginamic.models.Life;
import fr.diginamic.models.Matrix;

import static fr.diginamic.GameOfLife.*;

public class MatrixTools
{

    public static void initializeBoard(Matrix board)
    {
        for (int i = 0; i < HEIGHT; i++)
        {
            for (int j = 0; j < WIDTH; j++)
            {
                board.setCell(DEAD, i, j);
            }

        }

    }

    public static void displayBoard(Matrix board)
    {
        // Print board content
        for (int i = 0; i < board.getRows(); i++)
        {
            System.out.print("| "); // Left border
            for (int j = 0; j < board.getCols(); j++)
            {
                System.out.print(board.getCell(i, j) + " | ");
            }
            System.out.println();

        }
    }

    public static Matrix advance(Matrix lifeBoard)
    {
        Matrix nextBoard = new Matrix(lifeBoard.getRows(), lifeBoard.getCols());

        for (int i = 0; i < lifeBoard.getRows(); i++)
        {
            for (int j = 0; j < lifeBoard.getCols(); j++)
            {
                if (ALIVE.equals(lifeBoard.getCell(i, j)))
                {
                    if (Life.isAlive(lifeBoard, i, j))
                    {
                        nextBoard.setCell(ALIVE, i, j);
                    } else
                    {
                        nextBoard.setCell(DEAD, i, j);
                    }
                } else
                {
                    if (Life.isBorn(lifeBoard, i, j))
                    {
                        nextBoard.setCell(ALIVE, i, j);
                    } else
                    {
                        nextBoard.setCell(DEAD, i, j);
                    }
                }
            }
        }
        return nextBoard;
    }

    public static void startLife(Matrix board)
    {
        int centerX = board.getRows() / 2;
        int centerY = board.getCols() / 2;

        // Create the glider shape
        board.setCell(DEAD, centerX, centerY); // Center cell
        board.setCell(ALIVE, centerX, centerY + 1); // Right of center
        board.setCell(ALIVE, centerX + 1, centerY + 2); // Two right, one down
        board.setCell(ALIVE, centerX + 2, centerY); // Two down
        board.setCell(ALIVE, centerX + 2, centerY + 1); // Two down, one right
        board.setCell(ALIVE, centerX + 2, centerY + 2); // Two down, two right
    }

}
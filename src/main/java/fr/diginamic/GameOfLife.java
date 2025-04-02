package fr.diginamic;

import fr.diginamic.lifeforms.Blinker;
import fr.diginamic.lifeforms.Glider;
import fr.diginamic.lifeforms.Lifeforms;
import fr.diginamic.lifeforms.Oscillator;
import fr.diginamic.models.Matrix;
import fr.diginamic.utils.InputValidator;
import fr.diginamic.utils.MatrixTools;
import fr.diginamic.utils.MenuDisplay;

import java.util.Scanner;

public class GameOfLife
{
    public static final int HEIGHT = 30;
    public static final int WIDTH = 20;
    public static final String DEAD = " ";
    public static final String ALIVE = "X";


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Matrix lifeBoard = new Matrix(HEIGHT, WIDTH);

        MatrixTools.initializeBoard(lifeBoard);
        //chose starting shape
        Lifeforms chosenShape;
        MenuDisplay.startMenu();
        int choice = InputValidator.userInputInt(sc);
        switch (choice)
        {
            case 1:
                chosenShape = new Glider();
                chosenShape.generate(lifeBoard, sc);
                break;
            case 2:
                chosenShape = new Blinker();
                chosenShape.generate(lifeBoard, sc);
                break;
            case 3:
                chosenShape = new Oscillator();
                chosenShape.generate(lifeBoard, sc);
                break;
        }
        boolean running = true;
        int gen = 0;
        do
        {
            System.out.printf("\n-------- Generation number %d -------- \n", gen);
            MatrixTools.displayBoard(lifeBoard);
            MenuDisplay.nextGenPrompt();
            choice = InputValidator.userInputInt(sc);
            switch (choice)
            {
                case 1:
                    break;
                case 2:
                    lifeBoard = MenuDisplay.changeShape(lifeBoard,sc);
                    MatrixTools.displayBoard(lifeBoard);
                    System.out.println("Enter to continue . . . ");
                    sc.nextLine();
                    gen = 0;
                    break;
                case 3:
                    running = false;

            }
            lifeBoard = MatrixTools.advance(lifeBoard);
            gen++;
        } while (running);
    }

}
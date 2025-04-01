package fr.diginamic;

import fr.diginamic.lifeforms.Glider;
import fr.diginamic.lifeforms.Lifeforms;
import fr.diginamic.models.Life;
import fr.diginamic.models.Matrix;
import fr.diginamic.utils.MatrixTools;
import fr.diginamic.utils.MenuDisplay;

import java.util.Scanner;

public class GameOfLife
{
    public static final int HEIGHT = 10;
    public static final int WIDTH = 10;
    public static final String DEAD = " ";
    public static final String ALIVE = "X";


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Matrix lifeBoard = new Matrix(HEIGHT, WIDTH);

        MatrixTools.initializeBoard(lifeBoard);


        //chose starting shape
        Lifeforms chosenShape;
        MenuDisplay.choseForm();
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                chosenShape = new Glider();
                chosenShape.generate(lifeBoard, sc);
                break;
            case 2:
                chosenShape = new Glider();
                chosenShape.generate(lifeBoard, sc);
                break;
            case 3:
                chosenShape = new Glider();
                chosenShape.generate(lifeBoard, sc);
                break;
        }


        while (true)
        {
            sc.nextLine();

            MatrixTools.displayBoard(lifeBoard);

            System.out.println("Press enter to advance to next generation");
            sc.nextLine();
            lifeBoard = MatrixTools.advance(lifeBoard);
            MatrixTools.displayBoard(lifeBoard);


        }
    }

}
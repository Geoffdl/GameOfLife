package fr.diginamic.utils;

import fr.diginamic.lifeforms.Blinker;
import fr.diginamic.lifeforms.Glider;
import fr.diginamic.lifeforms.Lifeforms;
import fr.diginamic.lifeforms.Oscillator;
import fr.diginamic.models.Matrix;

import java.util.Scanner;

public class MenuDisplay
{
    public static void startMenu()
    {
        System.out.println("\n\n=======================   WELCOME TO CONWAY'S GAME OF LIFE    =======================   ");
        System.out.println(" \nChose a shape to get started\n");
        System.out.println("\t1. The glider, the most simple moving shape in the Game of Life ");
        System.out.println("\t2. The blinker, a very simple oscillator");
        System.out.println("\t3. The Pentadecathlon, a more advanced oscillator");
        System.out.println("\t4. The Gosper glider gun, the first discovered life generating factory!");
        System.out.println("\t5. Exit");
        System.out.print("\nMake your choice :");

    }
    public static void changeForm()
    {
        System.out.println("1. The glider, the most simple moving shape in the Game of Life ");
        System.out.println("2. The blinker, a very simple oscillator");
        System.out.println("3. The Pentadecathlon, a more advanced oscillator");
        System.out.println("4. The Gosper glider gun, the first discovered life generating factory!");

        System.out.print("\nMake your choice :");

    }

    public static void nextGenPrompt(){
        System.out.print("\n1. Advance \t");
        System.out.print("\t2. Reset the matrix with a different shape \t");
        System.out.print("\t3. Exit \n");
        System.out.print("\nMake your choice : ");

    }

    public static Matrix changeShape(Matrix lifeBoard, Scanner sc){
        System.out.println();
        System.out.println("    =======================   CHANGING SHAPE    =======================   ");
        MatrixTools.initializeBoard(lifeBoard);
        Lifeforms chosenShape;
        MenuDisplay.changeForm();
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

        return lifeBoard;
    }
}
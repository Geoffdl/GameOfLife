package fr.diginamic.utils;

import java.util.Scanner;

public class InputValidator
{
    public static int userInputInt(Scanner sc)
    {
        while (true)
        {
            try
            {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e)
            {
                System.out.println("Please enter a valid number!");
            }
        }

    }

    public static String userInputString(Scanner sc)
    {
        sc.nextLine();
        while (true)
        {
            String input = sc.nextLine().trim();
            if (!input.equals("exit"))
            {
                return "";
            }
            if(input.trim().equals("")){
                return "";
            }
            if(input.equals("exit")){
                return input.toLowerCase().trim();
            }
            else {
                System.out.println("\n Press enter to advance to the next generation or type exit to end all (artificial) life! . . . ");}
        }
    }

    public static void waitForEnter(Scanner sc){
        System.out.println("\nAppuyez sur Entrée pour continuer...");
        sc.nextLine();
    }
}
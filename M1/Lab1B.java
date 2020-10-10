/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab1B
*/

import java.util.Scanner;

public class Lab1B {
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a line of text:");
        message = scan.nextLine();
        System.out.println ("You entered: \"" + message + "\"");
    }
}

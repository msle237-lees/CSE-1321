/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab2A
 */

//Sample run:
//        Enter a name: Tiffany
//        Enter another name: Bubba
//        Enter a verb: eat
//        Enter an adverb: wickedly
//        Once upon a time, there was a person named Tiffany who had a child named
//        Bubba. This child would eat wickedly while singing to strangers.
//

import java.util.Scanner;

public class Lab2A {
    public static void main(String[] args){
        String name;
        String name2;
        String verb;
        String adverb;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        name = scan.nextLine();
        System.out.print("Enter another name: ");
        name2 = scan.nextLine();
        System.out.print("Enter a verb: ");
        verb = scan.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = scan.nextLine();
        System.out.println("Once upon a time, there was a person named " + name + " who had a child named " + name2 + ". This child would " + verb+ " " + adverb +
                " while singing to strangers.");
    }
}

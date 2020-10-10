/*
Class:          CSE 1321L
Section:        10
Term:           Fall 2020
Instructor:     Deeksha Koya
Name:           Michael Lees
Lab#:           Lab2C
 */

import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args){
        int width;
        int height;
        int area;
        int perimeter;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = scan.nextInt();
        System.out.print("Enter a height: ");
        height = scan.nextInt();
        area = width * height;
        perimeter = (width * 2) + (height * 2);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}

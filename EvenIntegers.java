//Clint Madariaga-Zittel
//The purpose of this assignment is to test if an integer is even or not.
//28 February 2017
//Bellevue University
//EvenIntegers.java


import java.util.Scanner;

public class EvenIntegers {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This program will test your integer to test if it is even.");
    System.out.print("Please enter the integer you'd like to test: ");
    int number = input.nextInt();
  
    //Testing if a number is divisible by 2, making it even.
    if (number % 2 == 0)
      System.out.println("Is " + number + " even? True!");
    else
      System.out.println("Is " + number + " even? False!");
  }
}
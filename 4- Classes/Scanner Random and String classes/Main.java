// To use classes from the Java API we must import them from their packages
// Java API catalog https://docs.oracle.com/javase/7/docs/api/

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){

    // ####### Scanner #######
    // The Scanner class is used to get user input
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username,age, and height");

    String userName = myObj.nextLine();  // get String input
    System.out.println("Username is: " + userName);  // Output user input
    
    int age = myObj.nextInt();  // get int input
    System.out.println("Age is: " + age);  // Output user input
    
    double height = myObj.nextDouble();  // get double input
    System.out.println("Height is: " + height);  // Output user input
    
	
	
    // ####### Random #######
    // The Random class is used to generate random values
	Random random = new Random();
	
	//generates a random boolean value true/false
	System.out.println(random.nextBoolean());
	
	//generates a random int value between 0 and 19
	System.out.println(random.nextInt(20));
	
	
	
    // ####### String #######
    // Surprise. String is a class that has manny useful methods/functions
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    String txt1 = "Hello World";
    System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt1.toLowerCase());   // Outputs "hello world"
    
    String txt2 = "Please locate where 'locate' occurs!";
    System.out.println(txt2.indexOf("locate")); // Outputs 7
    
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    String myStr3 = "Another String";
    System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
    System.out.println(myStr1.equals(myStr3)); // false
    
    }

}


# Java Reference

## 1. Variables and Control Structures

```java
public class Main{

    public static void main(String[] args){

		// Variables and data types
		int myNum = 5;               // Integer (whole number), others: byte, short, int, long
		double myFloatNum = 5.99;    // Floating point number, others: float, double
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		//Arithmetic Operators: + - * / % ++ --
		//Assignment Operators: = += -= *= /= %=
		System.out.println( 1 + 2 );
		
		//Comparison Operators: == != >  < >= <=
		//Logical Operators: && || !
		System.out.println( 1 == 1 && 1 != 2 );
		
		
		int x = 0;
		
		// Control Structures: Conditional , Iterative/Loop
		
		// Conditional structures:	if , switch 
		
		if(x  == 1){System.out.println( "first" );}
		else if(x == 2){System.out.println( "second" );}
		else{System.out.println( "third" );}
		
		
		switch(x){
			case 1: System.out.println( "first" ); break;
			case 2: System.out.println( "second" ); break;
			case 3: System.out.println( "third" ); break;
			default: System.out.println( "fourth" ); break;
			
		}
        
		
		// Iterative/Loop structures:	do while, while, for
		
		x = 1;
		
		do{
			System.out.println( x );
			x = x + 1;
		}while(x <= 5);
		
		x  = 1;
		
		while(x <= 5){
			System.out.println( x );
			x = x + 1;
		}
		
		
		for(int i = 0; i <= 3 ; i = i + 1){
			System.out.println( i );
		}
        
    }
}
```

## 2. Arrays

```java

public class Main {
	
  public static void main(String[] args) {
  
	String[]  weekDays =    {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    double[]  tempratures =  {36,35,36,36,37,37,35};
	
	//int[] x = int[3]; // Defining and empty array that can carry 3 elements
	//int[][] y = {{1,2,3},{4,5,6}}; // Defining a two dimensional array
	

	double totalTemp = 0;
	double maxTemp = tempratures[0];
	double minTemp = tempratures[0];
	
	for(int i = 0 ;  i <  weekDays.length ; i++){


		System.out.println("Temprature on " + weekDays[i] + " is: " + tempratures[i]);
		totalTemp = totalTemp + tempratures[i];
		
				
		if( tempratures[i] > maxTemp ){ maxTemp = tempratures[i]; }
		if( tempratures[i] < minTemp ){ minTemp = tempratures[i]; }
			
	}
	
	System.out.println("Total Temprature: " + totalTemp );
	System.out.println("Average Temprature: " +  (totalTemp / tempratures.length)   );
	
	
	System.out.println("Min: " +  minTemp   );
	System.out.println("Max: " +  maxTemp  );

  }
  
}

```


<details>
<summary>Print values in a 2D array</summary>

```java
public class Main {

    public static void main(String[] args) {
    
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
  
    }
    
  }

/* Output:

1,2,3,
4,5,6,
7,8,9,
10,11,12,

*/

```

</details>

<details>
<summary>Sum elements in a 2D array</summary>

```java
public class Main {

    public static void main(String[] args) {
    
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        
        System.out.println("The sum is: " + sum );
    }
    
  }
```
</details>

<details>
<summary>Count elements in a 2D array</summary>

```java
public class Main {

    public static void main(String[] args) {
    
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int count=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }
        
        System.out.println("The count is: " + count );
    }
    
  }
```
</details>

<details>
<summary>Sum elements in a 2D array and find their average</summary>

```java
public class Main {

    public static void main(String[] args) {
    
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int sum=0;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                sum += arr[i][j];
            }
        }
        
        System.out.println("The average is: " + ( (double) sum/count ) );
    }
    
  }
```
</details>




## 3. Functions

```java

public class Main {
	
  public static int  myFun1 (int x){
	  
	  int doubleValue = x * 2;
	  
	  return doubleValue;
	  
  }
  
  	
   public static void  myFun2 (String myInput){
	  
	  System.out.println("The input is : " +  myInput);

  }

  public static void main(String[] args) {
  
	// Calling fucntions that return a value
	
    int result = myFun1(6);
	System.out.println(result);
	
	System.out.println(myFun1(8));
	
	// Calling funcitons that do not return anything
	
	myFun2("Hi");
	myFun2("Morning");
	myFun2("How are you?");


  }
  
}

```


<details>
<summary>Sample program without using functions</summary>

```java
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Please enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        
        int sum = x + y;
        System.out.println("The sum is: " + sum);
  
    }
    
  }
```
</details>

<details>
<summary>Sample program using a function with no input or return value</summary>

```java
import java.util.Scanner;

public class Main {

    public static void  addNumbers(){

        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Please enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        
        int sum = x + y;
        System.out.println("The sum is: " + sum);

    }
    
    public static void main(String[] args) {
    
        addNumbers();
  
    }
    
  }
```
</details>

<details>
<summary>Sample program using a function with input</summary>

```java
import java.util.Scanner;

public class Main {

    public static void  addNumbers(int x, int y){
        
        int sum = x + y;
        System.out.println("The sum is: " + sum);

    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Please enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();

        addNumbers(x,y);
  
    }
    
  }
```
</details>

<details>
<summary>Sample program using a function with input and a return value</summary>

```java
import java.util.Scanner;

public class Main {

    public static int  addNumbers(int x, int y){
        
        int sum = x + y;
        
        return sum;

    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Please enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("The sum is: " + addNumbers(x,y) );
  
    }
    
  }
```
</details>


## 4.1 Classes

```java

public class Main {

  public static void main(String[] args) {

	Fruit obj1 = new Fruit();
	obj1.name = "Orange";
    obj1.eat();
	
	Fruit obj2 = new Fruit();
	obj2.name = "Apple";
	obj2.peel();
    obj2.eat();
	
  }
  
}

class Fruit {
	
	public String name;
	public boolean peeled = false;

	public void peel(){
		this.peeled = true;
		System.out.println("Peeled the " + " " + this.name);
	}

	public void eat(){
		if(this.peeled){System.out.println("Ate the " + this.name);}
		else{System.out.println("Please peel the " + this.name + " first");}
	}

}

/*
Output:
Please peel the Orange first
Peeled the  Apple
Ate the  Apple
*/

```

## 4.2 Class Constructures

```java

public class Main {

  public static void main(String[] args) {

	Fruit obj1 = new Fruit("Orange");
    obj1.eat();
	
	Fruit obj2 = new Fruit("Apple");
	obj2.peel();
    obj2.eat();
	
  }
  
}


class Fruit {
	
	public String name;
	public boolean peeled = false;

	// Fruit Constructor
	public Fruit(String name){
		this.name = name;
	}
	
	public void peel(){
		this.peeled = true;
		System.out.println("Peeled the " + " " + this.name);
	}

	public void eat(){
		if(this.peeled){System.out.println("Ate the " + this.name);}
		else{System.out.println("Please peel the " + this.name + " first");}
	}

}


/*
Please peel the Orange first
Peeled the  Apple
Please peel the Apple first
*/
```

## 4.3 Scanner, Random and String Classes

```java
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


```

<!-- 
## 5. Section

```java

``` -->


## 5. Excercises

Provided the following information
about a number books (title,pages,subject,owner):

Linear Algebra , 200 , Maths , none Thermodynamics , 700 , Physics , none
Astrophysics , 500 , Physics , none

Write a program that:

- Prints information for all books
- Find the physics book with most number of pages

<details>
<summary>Solution using parallel arrays</summary>

```java
import java.util.Scanner;
```
</details>

<details>
<summary>Solution using classes</summary>

```java
import java.util.Scanner;
```
</details>
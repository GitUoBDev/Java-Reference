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

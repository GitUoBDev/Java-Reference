
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

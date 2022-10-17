
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

package week1.day1;

public class Factorial {

	public static void main(String[] args) {
	
		// Declare your input as 5--Declare an integer variable fact as 1
		
		int fact=1,i;
		
		// Iterate from 1 to your input (tip: using loop concept)
		for ( i = 1; i<=5; i++) {
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
		 fact=i*fact ;
			//End of loop
			
		}

		// Print factorial (fact)
		System.out.println(fact);
	}

}

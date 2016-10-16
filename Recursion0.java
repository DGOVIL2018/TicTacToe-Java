import java.util.Scanner; 

 
public class Recursion0 
{ 
 
 
 /** 
 Created By : Dhruv Govil 
 This method prints out the integers from 0 to n inclusive 
 n is obtained from user input 
 First recursive program 
 Version# : 1 
  
  
 */ 
 	public static void main (String[] args) 
 	{ 
		Scanner input = new Scanner (System.in); 
 		System.out.print("Enter a positive integer n: "); 
 		int n = input.nextInt(); 
 		 
 		printNum(n); 
 	} 
 	 
 	 
 	 
 	 
 	public static void printNum (int n) 
 	{ 
		if ( n < 0) //checks for invalid user input --> avoids infinite loop if user enters a negative number
		{
			System.out.println("Please enter a positive integer");
		}
		


 		else if (n == 0) //terminating case
 		{ 
 			System.out.println(n); 
 		} 
 	 
		else 
 		{ 
 			System.out.println(n); 
 			printNum(n-1); //call the same function with one less than the current number
 		} 
 		 
	 
 	} 	 
 }	 

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
 	 
 	 
/**
This method takes in an integer n and prints a column of the numbers from 0 to n (both inclusive)
*/ 	 
 	 
 	public static void printNum (int n) 
 	{	
		if (n < 0) //checks for invalid user input --> only positive integers accepted
		{
			System.out.println("Please enter a positive integer.");
		}
		

 		if (n > 0) //terminating case
 		{ 
 			printNum(n - 1); 
 		} 
 	 
		System.out.println(n);
 		
	 
 	} 	 
 }	 

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
		if ( n < 0)
		{
			System.out.println("Please enter a positive integer");
		}
		


 		else if (n == 0) 
 		{ 
 			System.out.println(n); 
 		} 
 	 
		else 
 		{ 
 			System.out.println(n); 
 			printNum(n-1); 
 		} 
 		 
	 
 	} 	 
 }	 

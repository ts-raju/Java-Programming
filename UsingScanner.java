// Using Java Scanner Class

import java.util.Scanner; 
class UsingScanner{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in); 
		float x, y, sum; 
		System.out.print("Enter First Number : "); 
		x=s.nextFloat(); 
		System.out.print("Enter Second Number : "); 
		y=s.nextFloat(); 
		sum=x+y; 
		System.out.println("The Sum = "+sum); 
		System.out.println("Difference = "+(x-y)); 
		System.out.println("Product = "+(x*y)); 
		System.out.println("Quotient = "+(x/y)); 
	}
}
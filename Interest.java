// Java program to Calculate Simple Interest

import java.util.Scanner; 
class Interest{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		float p, t, r, i; 
		System.out.print("Enter P: "); 
		p=inp.nextFloat();
		System.out.print("Enter T: ");
		t=inp.nextFloat(); 
		System.out.print("Enter R: "); 
		r=inp.nextFloat();
		i = (p*t*r)/100;
		System.out.println("Interest = "+i);
	}
}
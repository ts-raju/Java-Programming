import java.util.Scanner; 
class FinallyTest{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in); 
		int x, y, z; 
		try{
			System.out.print("Enter First Number :  "); 
			x = s.nextInt(); 
			System.out.print("Enter Second Number  : "); 
			y = s.nextInt(); 
			z = x/y; 
			System.out.println("Quotient = "+z); 
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception "+e); 
		}finally{
			System.out.println("Finally Block is always executed."); 
		}
		System.out.println("Rest of the coes."); 
	}
}
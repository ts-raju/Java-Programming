import java.util.*; 
class MultiCatchException{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in); 
		try{
			int a[] = new int[5];
			int n;
			System.out.println("Enter n: "); 
			n = s.nextInt();
			System.out.println("Enter Data Elements"); 
			for(int i=0; i<n; i++){
				a[i] = s.nextInt(); 
			}
			
			int x, y, z; 
			System.out.println("Enter x and y: "); 
			x = s.nextInt(); 
			y = s.nextInt(); 
			z = x/y;
			System.out.println("Quotient : "+z); 
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalide array Index !!!!"); 
		}
		catch(ArithmeticException e){
			System.out.println("Exception: "+e); 
		}
	}
}
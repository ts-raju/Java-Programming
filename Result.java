import java.util.*; 
class Person{
		String name; 
		int age; 
		Scanner in = new Scanner(System.in);
		public void getData(){ 
			System.out.print("Enter Name : "); 
			name = in.next(); 
			System.out.print("Enter Age : "); 
			age = in.nextInt(); 
		} 
		public void display(){
			System.out.print("Name = "+name);
			System.out.print("\nAge = "+age); 
		}
}

class Student extends Person{
	int sid; 
	String level; 
	public void getData(){
		super.getData();
		System.out.print("Enter Student ID : "); 
		sid = in.nextInt(); 
		System.out.print("Enter Level : "); 
		level = in.next(); 
	}
	public void display(){
		super.display(); 
		System.out.println("Student ID = "+sid);
		System.out.println("Level    = "+level); 
	}
}

class Result extends Person{
	int sub1, sub2, sub3, total; 
	public void getData(){
		super.getData(); 
		System.out.print("Marks in Subject 1: ");
		sub1 = in.nextInt(); 
		System.out.print("Marks in Subject 2: ");
		sub2 = in.nextInt();
		System.out.print("Marks in Subject 3: ");
		sub3 = in.nextInt(); 
		total = sub1 + sub2 + sub3; 
	}
	public void display(){
		super.display();
		System.out.println("\nSubject 1 = "+sub1); 
		System.out.println("Subject 2 = "+sub2); 
		System.out.println("Subject 3 = "+sub3); 
		System.out.println("Total = "+total); 
	}
	public static void main(String args[]){
		Result obj = new Result(); 
		System.out.println("\n******INPUT*******"); 
		obj.getData();	
		System.out.println("\n\n*********Result*********"); 
		obj.display();
	}	
}

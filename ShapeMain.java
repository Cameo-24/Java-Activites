import java.util.Scanner;
public class ShapeMain {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the Shape:");
		String a=s.next();
		if(a.equalsIgnoreCase("Square")){
			System.out.println("enter the radius:\n");
			int r=s.nextInt();
			Square c = new Square(r);
			c.calculateArea2(r);
		}
		else if(a.equalsIgnoreCase("Circle")){
			System.out.println("enter the radius:\n");
			int r=s.nextInt();
			Circle c = new Circle(r);
			c.calculateArea1(r);
			
		}
		
	
			
			
			
		}
		
	}



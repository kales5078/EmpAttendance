import java.util.Scanner;
import java.lang.Math;
public class GetLength
{
	public static void main(String[] args) {
	       System.out.println("This is program for calculate length");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of x1");
		double x1 = sc.nextDouble(); 
		System.out.println("Enter the value of x2");
		double x2 = sc.nextDouble();
	        System.out.println("Enter the value of y1");
		double y1 = sc.nextDouble(); 
		System.out.println("Enter the value of y2");
		double y2 = sc.nextDouble();
                double length;
       
       length = Math.sqrt((x2 - x1 ) + (y2 - y1) * (x2 - x1 ) + (y2 - y1));
       System.out.println("The length is :" + length);
	}
}

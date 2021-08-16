package company;

import java.lang.Math;  //Import Math function to get Random Number
public class EmployeeAttendance
{
	public static void main(String[] args) {
	 
	 int IS_PRESENT = 1;  
	 double Empcheck = Math.floor(Math.random() * 10) % 2;
	 
	 
	   if (Empcheck == IS_PRESENT)
	    System.out.println("Employee is Present");
	    else
	     System.out.println("Employee is Absent");
	 
	   
	   
	}
}

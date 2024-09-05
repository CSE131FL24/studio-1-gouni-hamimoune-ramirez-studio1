package studio1;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Input year: ");
	int year = scan.nextInt();
	
	
	boolean leap = false;
	if (year%4 == 0)
	{
		leap = true;
	}
System.out.print(year + " is a leap year: " + leap);
	}

}

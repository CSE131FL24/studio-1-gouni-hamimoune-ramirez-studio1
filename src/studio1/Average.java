package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
System.out.println("First number to be averaged: ");
int first = scan.nextInt();
System.out.println("Second number to be averaged: ");
int second = scan.nextInt();
double avg = (first + second)/2.0;
System.out.print("The average of the two numbers is " + avg);	

}
}

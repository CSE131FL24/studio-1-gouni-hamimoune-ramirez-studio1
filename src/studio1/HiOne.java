package studio1;

import java.util.Scanner;

public class HiOne {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		System.out.print("Hi, " + name + ". How are you?");
		
	}

}

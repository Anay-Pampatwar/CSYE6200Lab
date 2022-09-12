package edu.northeastern.csye6200;
import java.util.Scanner;
public class L1P2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int y, f, i;
		System.out.println("Enter number of yards:");
		y = input.nextInt() * 36;
		//System.out.println("y:"+y);
		System.out.println("Enter number of feet:");
		f = input.nextInt() * 12;
		//System.out.println("f:"+f);
		System.out.println("Enter number of inches:");
		i = input.nextInt();
		//System.out.println("i:"+i);
		int final1 = y+f+i;
		System.out.println("Total number of inches: " + final1);

	}

}



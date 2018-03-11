package by.epam.jb24.circle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double r = 0;
		double p = 3.14;
		double length;
		double square;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please, enter radius " );
		if (sc.hasNextDouble()) {
			r = sc.nextDouble();
		}
		length = 2 * p * r;
		square = p * r * r;
		
		System.out.println("Result: Length = " + length + " Square = " + square);
	}

}

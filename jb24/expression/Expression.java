package by.epam.jb24.expression;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		double a =0;
		double b =0;
		double c =0;
		double res;
		double znam;
		double chis;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a: ");
		if(sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.println("Enter b: ");
		if(sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.println("Enter c: ");
		if(sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		
		chis = b + Math.sqrt(b * b + 4 * a* c);
		znam = 2 * a;
		res = chis / znam - a * a * a * c + b;
		
		System.out.println("Result: " + res);
	}

}

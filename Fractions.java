package oefeningen.thuis;

import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    String[] input = scanner.nextLine().split(" ");

	    int a = Integer.parseInt(input[0]);
	    int b = Integer.parseInt(input[1]);
	    int gcd = gcd(a, b);

	    System.out.println(a / gcd + " " + b / gcd);

	}

	// Euclidean Algorithm for finding greatest common divisor
	public static int gcd(int a, int b) {
	    return (a == 0 || b == 0) ? Math.max(a, b) : gcd(b, a % b);
	}

}

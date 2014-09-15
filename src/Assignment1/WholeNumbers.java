package Assignment1;

import java.util.Scanner;

class WholeNumbers {
	// *
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program takes three numbers and outputs the average");
		System.out.println("Input first number: ");
		int number1 = sc.nextInt();
		System.out.println("Input second number: ");
		int number2 = sc.nextInt();
		System.out.println("Input third number: ");
		int number3 = sc.nextInt();
		int average = (number1 + number2 + number3) / 3;
		System.out.print("The average is: " + average);

	}

}



package calculator;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//For user based inputs
		//char n='i';
		int ctr=0;// Used a flag that drives the loop
		while (ctr != 1) {
			
			Calculator c = new Calculator();
			System.out.println("Please enter the operation add , subtract, mulitply or divide  ONLY");//Thinking of a better way to ask for inputs
			System.out.println("Please choose an operation");
			String op = scanner.nextLine();//user based operation
			System.out.println("Please enter the first number");
			int a = Integer.valueOf(scanner.nextLine());//enter the first number
			System.out.println("Please enter the second number");
			int b = Integer.valueOf(scanner.nextLine());//Enter the second number
			switch (op) {
			case "add":
				System.out.println(c.sum(a, b));
				break;
			case "Add":
				System.out.println(c.sum(a, b));
				break;
			case "subtract":
				System.out.println(c.subtract(a, b));
				break;
			case "Subtract":
				System.out.println(c.subtract(a, b));
				break;
			case "Multiply":
				System.out.println(c.mulitply(a, b));
				break;
			case "multiply":
				System.out.println(c.mulitply(a, b));
				break;
			case "Divide":
				System.out.println(c.divide(a, b));
				break;
			case "divide":
				System.out.println(c.divide(a, b));
				break;
			default:
				System.out.println("There must have been a typo");
				break;

			}
			System.out.println("Do you want to continue, y/n");//Giving the user the choice to go on.
			String n=scanner.nextLine();
			if(n.equals("n")) {
				ctr++;
				break;
			}
			
		}

	}

}

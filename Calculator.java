package calculator;

public class Calculator {
	private int a;
	private int b;
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	public int sum(int a, int b) {
		int c=a+b;
		System.out.print("The result is ");
		return c;
	}
	public int subtract(int a, int b) {
		int c=a-b;
		System.out.print("The result is ");
		return c;
	}
	public double mulitply(int a, int b) {
		double c=(double)a*b;
		System.out.print("The result is ");
		return c;
	}
	public double divide(int a, int b) {
		double c=(double)a/b;
		System.out.print("The result is ");
		return c;
	}
	

}

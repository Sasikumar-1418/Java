package task.index;

public class OperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		//addition operator
		System.out.println("Addition of two Numbers: "+(a+b));
		//subtraction
		a = 50;
		b = 30;
		System.out.println("Subtraction of two Numbers: "+(a-b));
		//Multiplication
		a = 7;
		b = 6;
		System.out.println("Multiplication of two Numbers: "+(a*b));
		//Division
		a = 50;
		b = 10;
		System.out.println("Divison of two Numbers: "+(a/b));
		//Modulous
		a = 5;
		b = 2;
		System.out.println("Modulus of two Numbers: "+(a%b));
		//Square root
		a = 9;
		System.out.println("Square of a number: "+ Math.pow(a, 2));
		//Maximum of two number
		a = 20;
		b = 50;
		System.out.println("Max of two numbers: "+ Math.max(a, b));
		//Minimum of two number
		a = 20;
		b = 50;
		System.out.println("Max of two numbers: "+ Math.min(a, b));
	}

}

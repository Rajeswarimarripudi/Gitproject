package JavaProject;

public class Calculator {
	
	public void add() {
		
		int a=1;
		int b=2;
		int c =a+b;
		System.out.println("Addtion: "+c);
		
	}
	public void sub() {
		int a=1;
		int b=2;
		int c =a-b;
		System.out.println("Subtraction: "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc= new Calculator();
		calc.add();
		calc.sub();

	}

}

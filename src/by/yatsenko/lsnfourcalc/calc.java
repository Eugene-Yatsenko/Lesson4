package by.yatsenko.lsnfourcalc;

public class calc {

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	
	public int increment(int x) {
		x++;
		return x;
	}
	
	// greetUser() - method signature
	public void greetUser() {
		System.out.println("Hello Bro!");
	}
	
	public void performOperation(String op, int x, int y) {
		int result;
		switch (op) {
			case "/": 
				result = divide(x, y);
				System.out.println(x+"/"+y+" = "+result);
				break;
			case "*": 
				result = multiply(x, y);
				System.out.println(x+"*"+y+" = "+result);
				break;	
			case "+": 
				result = add(x, y);
				System.out.println(x+"+"+y+" = "+result);
				break;
			case "-": 
				result = substract(x, y);
				System.out.println(x+"-"+y+" = "+result);
				break;
		
		}
		
	}
	

}

package by.yatsenko.lsnfourrunner;

import java.util.Scanner;

import by.yatsenko.lsnfourcalc.*;

public class Runner {

	public static void main(String[] args) {
		
		calc cr = new calc();
		int x = 4;
		int y = 2;
		String s;
		
		cr.greetUser();
		
		System.out.println("Input the 1st number");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		System.out.println("Input the 2nd number");
		in = new Scanner(System.in);
		y = in.nextInt();
		
		System.out.println("Choose operation");
		in = new Scanner(System.in);
		s = in.nextLine();
		
		cr.performOperation(s, x, y);
//		switch (s) {
//		
//		case "*":
//			
//			int result = cr.multiply(x, y);
//			System.out.println(x+"*"+y+" = "+result);
//			break;
//			
//		case "/":	
//			result = cr.divide(x, y);
//			System.out.println(x+"/"+y+" = "+result);
//			break;
//			
//		case "+":	
//			result = cr.add(x, y);
//			System.out.println(x+"+"+y+" = "+result);
//			break;
//			
//		case "-":
//			result = cr.substract(x, y);
//			System.out.println(x+"-"+y+" = "+result);
//		
//		case "++":
//			result = cr.increment(x);
//			System.out.println("Increment "+x+" = " + result);
//		}

	}

}

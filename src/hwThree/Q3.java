package hwThree;

//test
import java.util.Scanner;

/*	Objective: This is a basic calc
	Author: AP
	Date: 4/1/2020
	Last Update: 04/02/2020
	Last Updated By: Angie
*/





public class Q3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		
		//Getting a int from the user
		System.out.println("Enter a number");
		double num1 = userInput.nextDouble();
		
		//Getting a int from the user
		System.out.println("Enter another number");
		double num2 = userInput.nextDouble();
		
		//Getting a String from the user
		System.out.println("Enter one of the following: add, sub, multi, div");
		String opt = userInput.next();
		
		//Switch
		
		switch(opt.toLowerCase()){
		case "add":		System.out.println(add(num1, num2));
						break;
		case "sub":		System.out.println(sub(num1, num2));
						break;
		case "multi":	System.out.println(multi(num1, num2));
						break;
		case "div":		System.out.println(div(num1, num2));
						break;
		default:		System.out.println("Please enter one of the following: add, sub, multi, div");
		}
		
		
//		//IF and Else for the operation
//		if(opt.equalsIgnoreCase("add")){
//			System.out.println(num1+num2);
//		}
//		else if(opt.equalsIgnoreCase("sub")){
//			System.out.println(num1-num2);
//		}
//		else if(opt.equalsIgnoreCase("multi")){
//			System.out.println(num1*num2);
//		}
//		else if(opt.equalsIgnoreCase("div")){
//			System.out.println(num1/num2);
//		}
//		else{
//			System.out.println("Please enter one of the following: add, sub, multi, div");
//		}
		

	}
	
	public static double add(double a, double b){
		return a+b;
	}
	
	public static double sub(double a, double b){
		return a-b;
	}
	
	public static double multi(double a, double b){
		return a*b;
	}
	
	public static double div(double a, double b){
		return a/b;
	}

}

package hwThree;

import java.util.Scanner;

public class Q5 {

	
		//if give N is a odd/even
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("give me a whole number greater than 0");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		
		if(N%2 == 0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}

}

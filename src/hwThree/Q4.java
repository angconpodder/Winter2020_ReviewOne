package hwThree;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		//Given a string, reply if its a Palindrome.
		// WOW, LEVEL, MOM == palindrome 
		
		//Step 1: get a string from user
		System.out.println("Enter a string");
		Scanner userInput = new Scanner(System.in);
		String original = userInput.next();
		
		//Step 2: reverse the user string and save it in new Variable
		//HELLO = H, E, L, L, O
		
		
		char[] originalArray = original.toCharArray();
		
		String reverse = "";
		
		for(int i=originalArray.length-1; i>=0; i--){
			reverse = reverse + originalArray[i];
		}
		//"o" = " " + 'o';
		//  "ol"  = "o" + 'l'
		//... "olleh"
		
		
		//h,e,l,l,o
		//olleh
		
		
		//Step 3: compare the original string from user with the reversed String
			//if true then Palindrome.
		
		if(original.equalsIgnoreCase(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		
		
		
	}

}

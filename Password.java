import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Password {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<String> savedPasswords = new ArrayList<String>(Arrays.asList("admin", "AMORE11", "BANANA22", "CARNIVAL33", "DANCE44"));

	public static void main(String[] args) {
		String e = sc.nextLine();
		validPassword(e);
		for (String str : savedPasswords)
	      { 		      
	           System.out.println(str); 		
	      }
	}
	
	//Defines vowels
	public static Boolean isVowel(char c) {
		
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'Y' };
		String s = String.valueOf(c);
		String vs = new String(vowels);
		if (vs.contains(s)) {
			return true;
		}
		else {
			return false;
		}
	}

	//Combines all rules
	public static boolean validPassword(String e) {
		if ((correctLength(e)&&number(e)&&space(e)&&capitalVowel(e)&&taken(e))==true
			|| (e.equalsIgnoreCase("mod")&&taken(e)==true )
			|| (e.equalsIgnoreCase("admin")&&taken(e)==true) ) {
			savedPasswords.add(e);
			return true;
		}else {
			return false;
		}
	}
	
	//Verifies that password does not already exist
	public static boolean taken(String e) {
		if (savedPasswords.contains(e)) {
			return false;
		}else {
		return true;
		}
	}

	//Verifies that the password meets length requirements
	public static boolean correctLength(String e) {
		if (e.length() < 7 || e.length() > 12) {
			return false;
		} else {
			return true;
		}
	}

	//Verifies that password includes a number that is not 6
	public static boolean number(String e) {
		char ch;
		boolean isNum = false;
	    for(int i=0;i < e.length();i++) {
	        ch = e.charAt(i);
	        if( Character.isDigit(ch)&& ch!= '6') {
	           isNum = true;
	    }
	        }
	    return isNum;}

	//Verifies that password does not include a space
	public static boolean space(String e) {

		if (e.contains(" ")) {
			return false;
		}else
			return true;
	}
	
	//Verifies that password include at least 2 capitalized vowels
	public static boolean capitalVowel(String e) {
		boolean vowels = false;
		int count = 0; 
		for(char c : e.toCharArray()) 
		 { 
		  if(isVowel(c)) {
			  count++;
			  } 
		  if (count >= 2) {
			  vowels = true; 
		  }
		  }
		return vowels;
		}
	
	
}

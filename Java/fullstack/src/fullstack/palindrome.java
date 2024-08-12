package fullstack;
import java.util.*;

public class palindrome {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String n= sc.nextLine();
		 String reversed = new StringBuilder(n).reverse().toString();
	        if (n.equals(reversed)) {
	            System.out.println(n + " is a palindrome.");
	        } else {
	            System.out.println(n + " is not a palindrome.");
	        }
	    }
	}

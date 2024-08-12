package fullstack;
import java .util.*;
public class Amstrong {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int n= sc .nextInt();
		int sum = 0, temp = n;
	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += digit * digit * digit;
	            temp /= 10;
	        }
	        System.out.println(n + " is " + (n == sum ? "an Armstrong number" : "not an Armstrong number"));
	    }
	}


package fullstack;
import java.util.*;

public class prime_number {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		System.out.println(num + " is " + (isPrime ? "prime" : "not prime"));
		sc.close();
		
	}

}

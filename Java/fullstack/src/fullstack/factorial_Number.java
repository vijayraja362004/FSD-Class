package fullstack;
import java .util.*;

public class factorial_Number {
public static void main(String args []) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the Number : ");
	int n = sc.nextInt();
	long fact =1;
	for (int i=1;i<=n;i++) {
		fact = fact*i;		
	}
	System .out.print(fact);
	
}


}

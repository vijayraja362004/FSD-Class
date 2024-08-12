package fullstack;
import java.util.*;
public class pattern {
 public static void main (String args []) {
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Enter the Count");
	 int n = sc.nextInt();
	 for (int i =0;i<n;i++) {
		 for (int j=0;j<=i;i++) {
			 System.out.println("*");
	 }
		 System.out.println(n);
	 }
 }
}

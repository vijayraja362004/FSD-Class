package fullstack;
import java .util.*;
public class fabanocci {
	
		public static void main (String args []){
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the Number");
		     int n = sc.nextInt();
		     int first = 0, second = 1;
		   System.out.print(first +" "+second+" ");
		     int fabanocci = 0;
		   for (int i=2;i<n;i++){
		   fabanocci =first + second;
		   System.out.print(fabanocci +" ");
		   first = second;
		    second =  fabanocci;
		   }
		  }
		}
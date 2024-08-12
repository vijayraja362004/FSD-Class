package fullstack;
import java.util.*;
public class compare_two_object {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	
    	String str = sc.nextLine();
    	String str2 = sc.nextLine();
        System.out.println("Objects are equal: " + str.equals(str2));
    }
}

import java.util.*;
  class main{
 public static void main (String args []){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the Number");
     int n = sc.nextInt();
     int first = 0, second = 1;
   System.out.print(first +" "+second+" ");
     int fabanocci = 0;
   for (int i=0;i>n;i++){
   fabanocci =first + second;
   System.oout.print(fabanocci +" ");
   first = second;
    second =  fabanocci;
   }
  }
}


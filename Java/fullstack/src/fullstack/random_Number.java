package fullstack;
import java.util.*;

public class random_Number {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("Random Number: " + randomNumber);
    }
}

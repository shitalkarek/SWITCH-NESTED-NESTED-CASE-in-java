import java.util.*;
public class example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter in between 1-7 to get days ");
        int days = sc.nextInt();

        switch(days)
        {
            case 1 -> System.out.println("monday");
            
            case 2 -> System.out.println("tuesday");
            
            case 3 -> System.out.println("wednesday");
            
            case 4 -> System.out.println("thursday");
            
            case 5 -> System.out.println("friday");
            
            case 6 -> System.out.println("saturday");
            
            case 7 -> System.out.println("sunday");

            default -> System.out.println("plzs enter in between 1 to 7");
        }
    }
}

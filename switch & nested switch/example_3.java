import java.util.*;

public class example_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers between 1 to  7  to get weekends or weekdays :");
        int days = sc.nextInt();

        switch (days) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
            default:
                System.out.println("plzs enter valid input");
            
        }
    }
}

import java.util.*;
public class example_1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the fruits name among apple orange grapes mango :");

    String fruits = sc.next();

    switch (fruits){

        case "apple" :
        System.out.println("red fruits");
        break;

        case "grapes" :
        System.out.println("smallest fruits");
        break;

        case "orange" :
        System.out.println("round fruits");
        break;

        case "mango" :
        System.out.println("king of fruits");
        break;

        default :
        System.out.println("plzs enter valid input");


    }
}
}
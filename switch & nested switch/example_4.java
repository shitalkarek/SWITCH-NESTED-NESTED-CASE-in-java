import java.util.*;

public class example_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee id :");
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID) {
            case 1:

                System.out.println(" karek");
                break;

            case 2:

                System.out.println("hero hiralal");
                break;

            case 3:
                
                System.out.println(" shital karek java programmer");
                
                switch (dept) {
                    case "IT":
                        System.out.println("IT DEPARTMENT");

                        break;

                    case "CSE":
                        System.out.println("CSE DEPARTMENT");

                        break;

                    default:
                        System.out.println("ENTER VALID DEPT NUMBER");
                        break;
                }

                break;

            default:
                System.out.println("ENTER VALID EMPLOYEE ID");
                break;
        }
    }
}

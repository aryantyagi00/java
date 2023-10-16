import java.util.Scanner;
public class weakdayorweekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter day");
        String day=sc.nextLine();
        switch(day){
            case "monday":System.out.println("This is weak day");
            break;
            case "Tuesday":System.out.println("This is weak day");
            break;
            case "wednesday":System.out.println("This is weak day");
            break;
            case "Thurday":System.out.println("This is weak day");
            break;
            case "friday":System.out.println("This is weak day");
            break;
            case "Saturday":System.out.println("This is weekend day");
            break;
            case "Sunday":System.out.println("This is weekend day");
            break;
        }
       
    }
}

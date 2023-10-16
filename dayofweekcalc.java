import java.util.Scanner;
public class dayofweekcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nodays=sc.nextInt();
        switch(nodays){
         case 1:
         System.out.println("sunday");
         break;
        case 2:
         System.out.println("Monday");
         break;
              case 3:
         System.out.println("Tuesday");
         break;
              case 4:
         System.out.println("wednesday");
         break;
              case 5:
         System.out.println("Thurday");
         break;
              case 6:
         System.out.println("friday");
         break;
              case 7:
         System.out.println("saturday");
         break;
         default:
         System.out.println("no.of days is incorrect");
        }
    }
}

import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println("Enter 1 to order Pizza");
        System.out.println("Enter 2 to order Burger");
        System.out.println("Enter 3 to order Drinks");
        System.out.println("Enter 4 to order pasta");
        System.out.println("Enter 5 to order Sweets");
        switch(choice){
           case 1:
               System.out.println("you have ordered Pizza");
               break;
           case 2:
               System.out.println("You have orderd Burger");
               break;
           case 3:
               System.out.println("You have ordred Drinks");
               break;
           case 4:
        }
    }
}

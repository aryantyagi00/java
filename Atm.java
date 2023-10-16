import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1: Balance enquiry");
        System.out.println("2:Deposit monney");
        System.out.println("3:Withdraw Money");
        int n=sc.nextInt();
        int balance=2000;
        int deposit=1000;
        int withdraw=500;
        switch(n){
            case 1:System.out.println("Balance is"+balance);
            break;
            case 2:System.out.println("Deposit money is"+deposit);
             balance=balance+deposit;
             System.out.println("Balance is"+balance);
            break;
            case 3:System.out.println("Withdraw money is"+withdraw);
            balance=balance-withdraw;
            System.out.println("Balance is"+balance);
            break;
            default:System.out.println("incorrect ");
        }
    }
}

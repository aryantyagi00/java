// package question1;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);

        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.print(c);
             a=b;
             b=c;

        }
    }
}

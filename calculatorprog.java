import java.util.Scanner;
public class calculatorprog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char operation=sc.next().charAt(0);
        int a =sc.nextInt();
        int b=sc.nextInt();
        switch(operation){
            case '+':System.out.println("Addition"+a+b);
            break;
            case '-':System.out.println("Subtraction of two no."+(a-b));
            break;
            case '*':System.out.println("Multiplication of two no."+a*b);
            break;
            case '/':System.out.println("division of two number"+a/b);
            break;
            default:
            System.out.println("incorrect character");
        }
    }
}

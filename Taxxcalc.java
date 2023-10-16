import java.util.Scanner;
public class Taxxcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  salary=sc.nextInt();
        if(salary<=10000){
            System.out.println("No tax");
        }
        else if(salary>10000&&salary<=20000){
            System.out.println("Tax is"+salary*0.10);
        }
        else if(salary>20000&&salary<30000){
          System.out.println("Tax is"+salary*0.15);
        }
        else {
            System.out.println("Tax is applicable"+salary*0.25);
        }
    }
}

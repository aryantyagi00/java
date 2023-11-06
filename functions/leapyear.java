import java.util.Scanner;
public class leapyear {

    static void leapyearornot(int year){
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        leapyearornot(year);
    }
}

import java.util.Scanner;
public class areaPer {

    static void area(int l,int b){
        float area=l*b;
        System.out.println("area og rectangle is:"+area);
    }

    static void perimeter(int l,int b){
        float per=2*(l+b);
        System.out.println("perimeter of rectangle is"+per);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        area(l,b);
        perimeter(l,b);
    }
}

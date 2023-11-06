import java.util.Scanner;
public class swap {

    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("first no. is :"+a);
        System.out.println("Second no. is:"+b);
    }

      static void swap1(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("first no. is :"+a);
        System.out.println("Second no. is:"+b);
    }

    static void swapusing(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("First no. is:"+a);
        System.out.println("Second no. is:"+b);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a=sc.nextInt();
        System.out.println("Enter the second no.");
        int b=sc.nextInt();
        swap(a,b);
        swap1(a,b);
        swapusing(a,b);
    }
}

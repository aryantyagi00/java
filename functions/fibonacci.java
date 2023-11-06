import java.util.*;
public class fibonacci {

    static void fib(int n){
      int fib1=0;
      int fib2=1;
      System.out.println(fib1);
      System.out.println(fib2);
      for(int i=2;i<=n;i++){
        int fib3=fib1+fib2;
        System.out.println(fib3);
        fib1=fib2;
        fib2=fib3;
      }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
}

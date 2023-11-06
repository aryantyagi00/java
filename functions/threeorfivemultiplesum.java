import java.util.Scanner;
public class threeorfivemultiplesum {

    static void sumofthreemultiple(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
          if(i%3==0){
            sum=sum+i;
          }
        }
        System.out.println("Sum of all 3 multiple at that the given number"+sum);
    }
    static void sumoffivemultiple(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
         if(i%5==0){
            sum=sum+i;
         }
        }
        System.out.println("Sum of all 5 multiple between the given number"+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumofthreemultiple(n);
        sumoffivemultiple(n);
    }
}

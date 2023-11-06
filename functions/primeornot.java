import java.util.Scanner;
public class primeornot {


    static boolean PrimeOrnot(int n){
        int flag=0;
        for(int i=2;i<=n-1;i++){
          if(n%i==0){
            flag=1;
          }}
        if(flag==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(PrimeOrnot(n)){
        System.out.println(n+"is a prime numeber");
    }
       else{
        System.out.println(n+"is not a prime number");
       }
    }
}

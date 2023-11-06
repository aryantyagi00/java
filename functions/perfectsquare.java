import java.util.*;
public class perfectsquare {

    static void perfectsquare(int n){
        double sr=(int) Math.sqrt(n);
        if(sr*sr==n){
         System.out.println(n+"is a perfect number");
        }
        else{
        System.out.println(n+"is not a perfect square");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfectsquare(n);
    }
}

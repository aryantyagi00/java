import java.util.*;
public class countreverse {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int l=sc.nextInt();
        // int r=sc.nextInt();

        // int pow=l-r;
        // int a=l-pow;
        int left=n%100;
        int right=n/100;
        int rot=left+right;
        System.out.println(rot);
     }
}

import java.util.*;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int r=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("enter r value");
        int r=sc.nextInt();
        int j=0;
        for(int i=n-r;i<n;i++){
           ans[j++]=arr[i];
        }
        // j=0;
        for(int i=0;i<=n-r-1;i++){
          ans[j++]=arr[i];
        }

         for(int i=0;i<ans.length;i++){
          System.out.print(ans[i]);
         }
    }
}

import java.util.Scanner;
public class findPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
                else{
                    System.out.println(i+" : is Prime");
                    break;
                }
            }
        }
    }
}

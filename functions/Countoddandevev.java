import java.util.Scanner;
public class Countoddandevev {

    static void countoddandeven(int n){
        int count=0;
        int count1=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                count++;
            System.out.println(i+"is a even number and total even no, is between these number is"+count);
            }
            else{
                count1++;
            System.out.println(i+"is a odd number and total add no. is between those number"+count1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countoddandeven(n);
    }
}

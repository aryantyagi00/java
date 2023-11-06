import java.util.Scanner;

public class countoddandeven1 {
    
    static void countoddandeven(int n){
        int count=0;
        int count1=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                count++;
            System.out.println(i+"is a even number ");
            }
            else{
                count1++;
            System.out.println(i+"is a odd number ");
            }


        }
        System.out.println("Toatal number of event number is "+count);
        System.out.println("Total number of odd number is "+count1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countoddandeven(n);
    }
}

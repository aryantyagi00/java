import java.util.Scanner; 
public class perfectnumber {

    static void perfectnumber(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }

        }
        if(sum==n){
            System.out.println(n+"is a perfect number");
        }
        else{
            System.out.println(n+"is not a perfect number");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfectnumber(n);
    }
}

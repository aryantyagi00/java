import java.util.Scanner;
public class simpleInterest {

  static void simpleInterest(int p,int r,int t){
    float SI=(p*r*t)/100;
    System.out.println("SI IS:"+SI);
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        int P=sc.nextInt();
        System.out.println("Enter the rate");
        int R=sc.nextInt();
        System.out.println("Enter the rate of time");
        int T=sc.nextInt();
        simpleInterest(P,R,T);
    }
}

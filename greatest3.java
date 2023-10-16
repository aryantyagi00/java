import java.util.*;

public class greatest3 {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();

     System.out.println((a>b&&a>c)?"a is greater no.":(b>c&&b>a)?"B is greater no.":"C is greter no.");
    }
}

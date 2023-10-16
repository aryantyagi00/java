import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height");
        float height=sc.nextFloat();
        System.out.println("Enter your weight");
        float weight=sc.nextFloat();
        float bmi= (weight/((float)(Math.sqrt(height))));
        System.out.println(bmi);



    }
}

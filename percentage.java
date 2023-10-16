import java.util.*;
public class percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you student name");
        String name=sc.nextLine();
        // System.out.println(name);
        String class_=sc.nextLine();
        // System.out.println(class_);


        System.out.println("enter you subjext");
        int subject=sc.nextInt();
        // System.out.println(subject);

        System.out.println("enter math marks");
        float math=sc.nextFloat();
        System.out.println("Enter hindi marks");
        float hindi=sc.nextFloat();
        System.out.println("Enter phy marks");
        float phy=sc.nextFloat();
        System.out.println("Enter chem marks");
        float chem=sc.nextFloat();
        System.out.println("enter biology marks");
        float biology=sc.nextFloat();
        float totalavg=(math+hindi+phy+chem+biology)/5;
        float marksper=((math+hindi+phy+chem+biology)*10)/50; 

        System.out.println(name);
        System.out.println(class_);
        System.out.println(subject);

        System.out.println("totalavg"+totalavg);
        System.out.println("marksper"+marksper);
        
    }
}

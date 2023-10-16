import java.util.*;
public class basicsalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
        int bs=sc.nextInt();
       
        int pf=1500;
        float hra=(bs*30)/100;
        float ta=(bs*20)/100;
        float da=(bs*10)/100;

        //  double hra=bs*0.3;

        System.out.println("hra"+hra);
        System.out.println("ta"+ta);
        System.out.println("da"+da);

        float netsalary=bs+hra+da+ta-pf;
        System.out.println(netsalary);



    }
}

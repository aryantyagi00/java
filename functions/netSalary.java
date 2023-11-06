import java.util.Scanner;
public class netSalary {

    static void hra(int bs){
        int hra=(bs*30)/100;
        System.out.println("hra is":+hra);
    }

    static void ta(int bs){
        int ta=(bs*20)/100;
        System.out.println("ta is:"+ta);
    }

    static void da(int bs){
        int da=(bs*10)/100;
        System.out.println("da is :"+da);
    }

    static void gross(int bs,int hra,int ta,int da){
        int gross=bs+hra+ta+da;
        System.out.println(gross);
    }
    static noid net(int )





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bs=sc.nextInt();
        hra(bs);
        ta(bs);
        ta(bs);
        netSalary(bs,hra,ta,da);
    }
}

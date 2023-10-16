import java.util.*;
public class VowelConstants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char char1=sc.next().charAt(0);
        if((char1 == 'a')||(char1=='e')||(char1=='i')||(char1=='o')||(char1=='u')){
          System.out.println("This character is vowel");
        }
        else{
           System.out.println("This character is not vowel");
        }
    }
}

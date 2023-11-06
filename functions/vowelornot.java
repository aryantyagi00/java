import java.util.Scanner;
public class vowelornot {

  static void vowelOrnot(char ch){
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        System.out.println("this character is vowel");
    }
    else{
        System.out.println("This character is not vowel");
    }
  }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        vowelOrnot(ch);
    }
}

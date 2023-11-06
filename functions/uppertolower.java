import java.util.Scanner;
public class uppertolower {

    static void convertopposite(char ch){
         if(ch>='A'&&ch<='Z'){
            char ch2=Character.toLowerCase(ch);
            System.out.println(ch2);
        }
        else{
          char ch2=Character.toUpperCase(ch);;
          System.out.println(ch2);
        }
    }

    static void convertstring(String str){
        int len=str.length();
        for(int i=1;i<=len;i++){
         char c=str.charAt(i);
          if(Character.isLowerCase(c)){
            //  str.setCharAt(i,Character.toUpperCase(c)); 
            c.toUpperCase();          
          }
          else{
            
          }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String str=sc.next();
        convertopposite(ch);
        convertstring(str);
       
    }
}

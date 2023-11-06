// package question1;

import java.util.Scanner;

public class anagramChecker {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      String s2=sc.next();
      boolean flag=false;
      for(int i=0;i<s1.length();i++){
        flag=false;
        for(int j=0;j<s2.length();j++){
            if(s1.charAt(i)==s2.charAt(j)){
                flag=true;
                break;
            }
        }

      } 
      if(flag==true){
        System.out.println("This string is anagram");
      }      
      else{
        System.out.println("This string is not anagram");
      }
    }
}

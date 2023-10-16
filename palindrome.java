public class palindrome {
    public static void main(String[] args) {
        int sum=0,temp,n=112311;
        temp=n;
        while(n!=0){
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
          System.out.println("this no. is palidrome no.");
        }
        else{
            System.out.println("this no.. is not a palindrome no.");
        }
    }
}

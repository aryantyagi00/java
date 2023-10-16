public class primeno{
 public static void main(String[] args) {
    int n=14;
    int flag=0;
    for(int i=2;i<n-1;i++){
        if(n%i==0){
            flag=1;
        }
    }
    if(flag==0){
        System.out.println("this is a  prime no.");
    }
    else{
        System.out.println("this no. is not a prime no.");
    }
 }    
}

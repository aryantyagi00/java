
public class hollowrhimbus {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
        for(int k=1;k<=5;k++){
            if(i==1||i==5||k==1||k==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}

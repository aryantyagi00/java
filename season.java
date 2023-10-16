
  import java.util.Scanner;
  public class season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter day");
        String month=sc.nextLine();
        switch(month){
            case "January":System.out.println("This is spring season");
            break;
            case "February":System.out.println("This is spring season");
            break;
            case "March":System.out.println("This is spring season");
            break;
            case "April":System.out.println("This is summer season");
            break;
            case "May":System.out.println("This is summer season");
            break;
            case "June":System.out.println("This is sunner season");
            break;
            case "July":System.out.println("This is falling season");
            break;
            case "August":System.out.println("This is falling season");
            break;
            case "September":System.out.println("This is falling season");
            break;
            case "October":System.out.println("This is winter season");
            break;
            case "November":System.out.println("This is winter season");
            break;
            case "December":System.out.println("This is winter season");
            break;
        }
       
    }
}



import java.util.Scanner;
public class RotateArray {

static int[] rotate(int[] arr,int k){
int n=arr.length;
k=k%n;

int ans[]=new int[n];
int j=0;
for(int i=n-k;i<n;i++){
    ans[j++]=arr[i];
}
for(int i=0;i<n-k-1;i++){
    ans[j++]=arr[i];
}
return ans;
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter"+n+"element");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the value  of k");
    int k=sc.nextInt();
    int ans[]=rotate(arr,k);
    for(int  i=0;i<ans.length;i++){
       System.out.println(ans[i]+" ");}
  
    }}

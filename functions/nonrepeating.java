import java.util.HashMap;
import java.util.Map;

public class nonrepeating {
       static int firstnonrepeating (int arr[],int n) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(m.get(arr[i])==1){
                return arr[i];
            }
        return 0;
        }
    }


    public static void main(String[] args) {
        int arr[]={9,4,9,6,7,4};
        int n=arr.length;
        firstnonrepeating(arr,n);
        // System.out.println(result);
    } 
}

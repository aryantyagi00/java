public class si {

    static int sip(int p,int r,int t){
        return ((p*r*t)/100);
    }


    public static void main(String[] args) {
        int p=100;
        int r=2;
        int t=2;
      int result= sip(p,r,t);
      System.out.println(result);
    }
}

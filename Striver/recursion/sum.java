package recursion;

public class sum {
    public static void main(String[] args) {
        //sum of first N number.
        int x=s(10);
        System.out.println(x);
    }
    static int s(int n){
        if(n<=0){
            return (0);
        }
        return n+s(n-1);
    }
    
}

package recursion;
public class factorial {
    public static void main(String[] args) {
        int n=5;
        int x=factorial(n);
        System.out.println(x);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n* factorial(n-1);
        }
    }
}

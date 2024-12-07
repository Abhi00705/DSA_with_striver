package recursion;

public class PrintNtime {
    public static void main(String[] args) {
        rec(0, 10);
    }

    static void rec(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        rec(i+1,n);
    }
}
    


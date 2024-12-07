package recursion;

public class printName {
    public static void main(String[] args) {
        p(1);
    }
    static void p(int n){
        if(n>5){
            return;
        }
        System.out.println("Abhishek");
        p(n+1);
    }
}

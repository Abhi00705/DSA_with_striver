package recursion;

public class print1n {
public static void main(String[] args) {
    f(1,5);
}    
static void f(int i, int n){
    if(i>n){
        return;
    }
    System.out.println(i);
    f(i+1,n);
}

}

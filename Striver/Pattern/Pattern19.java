public class Pattern19 {
    public static void main(String[] args) {
        int n=10;
        int n1=n/2;
        int n2=n/2;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1-i+1;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n1-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n1-i+1)-2;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

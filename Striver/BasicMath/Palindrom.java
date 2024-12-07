public class Palindrom {
    public static void main(String[] args) {
        
            int inital= 100;
            int last= 1300;
                for(int i=inital;i<=last;i++){
                    if(i == reverse(i)){
                        System.out.println("this number is palindrom:" + i );
                    }
                    
                }
            }
            
            
            static int reverse(int n){
                int rev=0;
                while(n!=0){
                    int rem = n%10;
                    rev = rev*10+rem;
                    n=n/10;
                }
                return rev;
            }
        }


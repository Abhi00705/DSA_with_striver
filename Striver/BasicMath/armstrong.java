import java.util.*;
public class armstrong{
	public static void main(String[] args){
		int num=342;
		    if(num==armstr(num)){
				System.out.println("Armstrong: "+num);
		    }
            else{
                System.out.println("Not armstrong number!");
            }
	}
	static int armstr(int n){
        int no_digit= (int)(Math.log(n)/Math.log(10))+1;
		int CubSum = 0;
		while(n!=0){
			int rem=n%10;
			CubSum= CubSum + (int)(Math.pow(rem, no_digit));
            n=n/10;
		}
		return CubSum;
	}
}
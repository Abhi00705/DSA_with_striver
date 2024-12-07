import java.util.*;
public class count{
	public static void main(String[] args){
		int n=123456789;
		int count = 0;
		//System.out.println(Math.floor(Math.log(n)/Math.log(10) + 1 ));  give number of digit.
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println("number of digit is : "+count);
	}
}
//output:987654321
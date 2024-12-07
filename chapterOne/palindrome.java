//8. To find out whether the given String is Palindrome or not. 
import java.util.*; 
public class palindrome {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		int rev = reverseNum(x);
		if(x==rev)System.out.println(x+" is palindrome");
		else System.out.println(x+" is not palindrome");		




	}
	static int reverseNum(int num){
		int rev=0,rem;
		while(num>0){
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
	return rev;
	}
}
import java.util.*;
 public class oddEven{

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		if(num%2 == 0){
		System.out.println("This is Even number ");
		}
		else{
		System.out.println("This number is Odd number ");
		}
        }
	
}
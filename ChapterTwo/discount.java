//4. Calculate Discount Of Product
import java.util.*;
public class discount{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Purchase amount of product : ");
		int price = sc.nextInt();
		System.out.print("Discount on product without % symbol: ");
		int discount = sc.nextInt();
		int result = price * discount/100;
		System.out.print("you saved : "+ result);
		System.out.println("new price : "+ (price-result));
	}
}

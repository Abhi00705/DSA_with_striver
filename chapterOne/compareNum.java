//5. Take 2 numbers as input and print the largest number.
import java.util.*;
public class compareNum{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two number: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	if(a>b)System.out.println(a+" is greater then  "+b);
	else System.out.println(b+" is greater then "+a);
}
}
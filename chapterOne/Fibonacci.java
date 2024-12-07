//7. To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class Fibonacci{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n : ");
	int n = sc.nextInt();
	int a=0,b=1,c;
	System.out.println(a +" , "+b+ " , ");

	while(n >0){
	c=a+b;
	System.out.println(c+ " , ");
	a=b;
	b=c;
	n--;
}
	
}
}
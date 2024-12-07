//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
import java.util.Scanner;
public class si{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the time : ");
	int t = sc.nextInt();
	System.out.println("Enter the principle : ");

	double p = sc.nextDouble();
	System.out.println("Enter the rate : ");

	int r = sc.nextInt();
	System.out.println("SI : "+ (p*r*t)/100);
	}
}
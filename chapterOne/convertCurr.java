//6. Input currency in rupees and output in USD.
import java.util.*;
import java.text.DecimalFormat;
public class convertCurr{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount in rupees : ");
	double amount = sc.nextDouble();
	DecimalFormat df = new DecimalFormat("#.##");
	System.out.println((int)amount + " rupees is  "+ df.format(amount/84.28)+ "$");

}}
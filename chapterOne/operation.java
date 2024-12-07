/*

Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
*/
import java.util.*;
public class operation{
public static void main(String[] args){
System.out.println("-------enter the operator (+, -, *, /)-------  ");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the num1 : ");
	int num1 = sc.nextInt();
	System.out.println("enter the num2 : ");
	int num2 = sc.nextInt();
	System.out.println("Enter the operation : ");
	String oper = sc.nextLine();

	if(oper == "+"){
		System.out.println("Sum of "+num1+" and "+ num2 +" is :  "+ (num1+num2) );
	}
	else if(oper == "-"){
		System.out.println("difference of "+num1+" and "+ num2 +" is :  "+ (num1-num2) );
	}

	else if(oper == "*"){
		System.out.println("product of "+ num1 +" and "+ num2 +" is :  "+ (num1*num2) );
	}

	else{
		System.out.println("Division of "+ num1 +" and "+ num2 +" is :  "+ (num1/num2) );
	}

	
	
}
}
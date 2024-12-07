
import java.util.*;
public class Pattern10{
	public static void main(String[] args){
		int n=9;
		for(int i=1;i<=n/2;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		int a=n-(n/2);
		for(int k=1;k<=a;k++){
			for(int j=1;j<=a-k+1;j++){
				System.out.print("*");
			}
		System.out.println();
		}	 
		
	}
}
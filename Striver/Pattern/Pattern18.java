import java.util.*;
public class Pattern18{
	public static void main(String[] args){
	int n=3;
	for(int i=1;i<=n;i++){
		for(int j=n;j>n-i;){
			System.out.print((char)(64+j));
		}
	System.out.println();
	}
	}
}
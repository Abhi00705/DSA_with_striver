import java.util.*;
public class Pattern15{
	public static void main(String[] args){
	int n=3;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n-i+1;j++){
		System.out.print((char)(64+j));

		}
	System.out.println();
	}

	}
}
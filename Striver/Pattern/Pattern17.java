/*---a---
--aba--
-abcba-
abcdcba
*/

import java.util.*;
public class Pattern17{
	public static void main(String[] args){
	int n=6;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print((char)(96+k));
		}
		for(int m=i-1;m>0;m--){
			System.out.print((char)(96+m));
		}
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
	System.out.println();
	}
	}
}
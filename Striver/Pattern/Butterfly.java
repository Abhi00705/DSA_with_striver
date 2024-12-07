/** _ *
1 8 1  (n1-i+1)*2 = 8 6 4 2  (x=integer)
2 6 2  
3 4 3
4 2 4
5 0 5

4 2 4
3 4 3
2 6 2
1 8 1
*/
import java.util.*;
public class Butterfly{

public static void main(String []args ){
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		for(int k=i;k<5;k++){
			System.out.print(" ");
		}
		for(int k=i;k<5;k++){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
	System.out.println();
	}
	for(int i=1;i<n;i++){
		for(int j=i;j<5;j++){
			System.out.print("*");
		}
		for(int k=1;k<=(2*i);k++){
			System.out.print(" ");
		}
		for(int j=i;j<5;j++){
			System.out.print("*");
		}
		System.out.println();	
	}
	}
}










import java.util.*;
public class pattern22{
public static void main(String[] args){
	int n=5;
	int x=n*2-1;
	for(int i=0;i<x;i++){
		for(int j=0;j<x;j++){
			if(i==i||j==j||i==n-i||j==n-i){
				System.out.print('4');
			}
		}
	}	
}
}
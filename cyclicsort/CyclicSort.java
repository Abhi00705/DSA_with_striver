
package cyclicsort;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0,n=arr.length;
        while(i<n-1){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
}

import java.util.*;
public class MissingNumber {
    
    public static void main(String[] args){
        int[] arr={3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(correct<arr.length && correct != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }

        return arr.length;
    }
}

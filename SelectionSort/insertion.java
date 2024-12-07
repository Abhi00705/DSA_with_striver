import java.util.Arrays;

class insertion{
    public static void main(String[] args) {
        int[] arr={3,2,8,1,9,0,5};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]){
                    break;
                }
                else if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        
        return arr;
    }
}
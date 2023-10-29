import java.util.Arrays;

public class Reverse_array {
    public static int[] reverse_array(int arr[],int n){
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        System.out.println(Arrays.toString(reverse_array(arr, n)));

    }
    
}

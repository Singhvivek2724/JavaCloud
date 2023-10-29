import java.util.Arrays;

public class Rotate_Array {
    public static int[] rotate(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }

        
        
       
    return arr;

    }
       public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        k=k%n;

        rotate(arr, 0, n-k-1);
        rotate(arr, n-k, n-1);
        rotate(arr, 0, n-1);
       for(int x:arr){
        System.out.print(x + " ");
       }
           
        
        
       
       
       

    }
    
}

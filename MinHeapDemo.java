//TC=o(n)
import java.util.*;
public class MinHeapDemo {
    public static void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int leftidx=i*2+1;
        int rightidx=i*2+2;
        if(leftidx <n && arr[leftidx]<arr[largest])
        {
            largest=leftidx;
        }
        if(rightidx <n && arr[rightidx]<arr[largest])
        {
            largest=rightidx;
        }
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr, n, largest);
        }
       
    }
    public static void displayheap(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
              System.out.print(arr[i] + " ");

        }
      
    }

    public static void buildheap(int arr[],int n)
    {
        int firstindex=n/2-1;
        for(int i=firstindex;i>=0;i--)
        {
            heapify(arr,n,i);

        }
    }
    public static void main(String args[])
    {
        int arr[]={ 3,2,1,5,6,4};
        int n=arr.length;
        buildheap(arr,n);
        displayheap(arr,n);
        

    }
    
}

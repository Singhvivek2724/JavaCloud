
import java.util.*;
public class kthLargestDemo {
  public static String kthLargestNumber(String[] nums, int k) {
        Integer arr[]=new Integer[nums.length];
 
         for(int i=0;i<arr.length;i++)
         {
               arr[i]=Integer.parseInt(nums[i]);
             
         }
        Arrays.sort(arr);
        int s=arr[nums.length-k];
        String str=String.valueOf(s);
        return str;
         
 
         
     }
   
    public static void main(String args[])

    {
       String nums[] = {"2","21","12","1"};int k =3 ;
       System.out.println(kthLargestNumber(nums, k));
        


     
    

    }
}
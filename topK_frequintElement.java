import java.util.*;
public class topK_frequintElement {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,3,3,4};
        int k=2;
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int max=0;
       // h.put(12,13);
       for(int i=0;i<n;i++)
       {
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i], 1);
            }
       }      
       
         PriorityQueue<Integer> p=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer i1,Integer i2)
            {
                
                return h.get(i2)- h.get(i1);

            }
         });
         p.addAll(h.keySet());
            System.out.println(p);
            //System.out.println(h);
       //System.out.println(p.poll());
           int arr1[]=new int[k];
          int i=0;
           int s=p.size()-k;
           System.out.println(s);
        while (s<p.size()) {
            int key = p.poll(); // Get and remove the key with the highest value
            arr1[i]=key;// Print the value associated with the key
            i++;
        }
        for(int y:arr1)
        {
            System.out.print(y + " ");
        }
    }
    
}
/* 
class MyComparator implements Comparator{
      public int compare(Object obj1,Object obj2){        
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
       return i2.compareTo(i1);
}
}

*/
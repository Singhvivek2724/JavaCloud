import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
        t.add(34);
        t.add(45);
        t.add(78);
        t.add(23);
      //  t.add(23);
        t.add(2);

        System.out.println(t);
    }

    
}
class MyComparator implements Comparator{

    public int compare(Object obj1,Object obj2){
        
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
       return i2.compareTo(i1);

        

    }

}

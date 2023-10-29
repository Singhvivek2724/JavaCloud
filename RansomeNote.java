
import java.util.*;
public class RansomeNote {
    public static boolean check(String s1,String s2)
    {
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
         if(s1.length()>s2.length())
        {
            return  false;
        }
        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            if(h1.containsKey(c1))
            {
                h1.put(c1,h1.get(c1)+1);

            }
            else{
                h1.put(c1,1);
            }

        }
         for(int i=0;i<s2.length();i++)
        {
            char c2=s2.charAt(i);
            if(h2.containsKey(c2))
            {
                h1.put(c2,h2.get(c2)+1);

            }
            else{
                h1.put(c2,1);
            }

        }
        for(Map.Entry<Character,Integer>e:h1.entrySet()){
            if(!h2.containsKey(e.getKey())|| e.getValue()>h2.get(e.getKey())){
                
            }

        }
        


        

    }
    public static void main(String arhs[])
    {
        String s1="a";
        String s2="ab";
       




        
    }
    
}

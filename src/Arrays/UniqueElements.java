package Arrays;

import java.util.HashSet;
import java.util.Set;
public class UniqueElements 
{
    public static void main(String[] args) 
    {
        String[] arr = {"apple", "banana", "orange", "mango", "apple", "banana"};
        printUniqueElements(arr);
    }
    public static void printUniqueElements(String [] arr)
    {
        Set<String> unique = new HashSet<String>();
        
        for(String element : arr)
        {
            unique.add(element);
        }
        for(String element : unique)
        {
            System.out.print(element +",");
        }
    }
    
    
}
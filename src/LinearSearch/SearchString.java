package LinearSearch;
import java.util.Arrays;

public class SearchString {

	public static void main(String[] args) 
	{
			String name = "Jinendra";
			char target = 'd';
			System.out.println(Arrays.toString(name.toCharArray()));
			System.out.println(linear(name,target));
			
	}
	static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
	static boolean linear(String str , char target)
	{
		if(str.length()==0)
		{
			return false;
		}
		
		for(int i = 0 ; i<str.length(); i++)
		{
			if(target == str.charAt(i))
			{
				return true;
			}
		}
		return false;
	}

}

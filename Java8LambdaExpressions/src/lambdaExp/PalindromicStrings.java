package lambdaExp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromicStrings {
	public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("bob");
        li.add("disney");
        li.add("MoM");
        li.add("xyzzyx");
        li.add("Epam");
        List<String> p =PalindromicStrings.findingPalindromes(li, 
                (s) -> PalindromicStrings.check((String) s));
 
        System.out.println("List of Palindromes are: " +p);
    }
 
    public static boolean check(String s) {
    	StringBuffer rev =new StringBuffer();
    	for(int i = s.length()-1; i >= 0 ; i--) {
    	rev = rev.append(s.charAt(i));
    	}
    	if(s.equalsIgnoreCase(rev.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findingPalindromes(List<String> list, Predicate<String> predicate) { 
    	List<String> result = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            result.add((String) i);
        });
        return result;
 
    }
    
}
package lambdaExp;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class StringStartsWithA3
{
	public static List<String> search(List<String> li) {
		return li
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> li = new ArrayList<String>();
		 li.add("apple"); 
	        li.add("arm"); 
	        li.add("bob");
	        li.add("aaa");
	        li.add("axe");
	        li.add("zavier");
	        List<String> res = search(li); 
	        System.out.println(res);
		 
            
		
	}
}

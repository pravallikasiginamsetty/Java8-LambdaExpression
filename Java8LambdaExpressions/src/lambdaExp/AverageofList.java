package lambdaExp;
import java.util.*;
import java.util.stream.*;

public class AverageofList
{
	static void Average(List<Integer> li)
	{
		
		li.stream() 
	    .mapToInt(i -> i) 
	    .average() 
	    .ifPresent(avg -> System.out.println("Average found is " + avg));
				
	}
	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<Integer>();
		li.add(22);
		li.add(45);
		li.add(5);
		li.add(10);
		li.add(4);
		Average(li);
	}
	

}

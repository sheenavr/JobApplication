package practicepgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortList {
	public static void main(String[] args) {
		//sort the list of names
		List<String> nameList= Arrays.asList("Dan","David","Aaron","James");
		nameList.stream().sorted()
		.collect(Collectors.toList()).forEach(System.out::println);
	
	//separate even and odd numbers
		
		
	}
	

}

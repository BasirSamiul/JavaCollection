package samiul.set.collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
		
		Set<String> set = Set.of("Apple", "Banana", "Cat");
		
		Set<String> hash_set = new HashSet<String>(set);
		
		System.out.println(hash_set.add("Dog"));
		
		System.out.println(hash_set);
		
		System.out.println(set);

	}

}

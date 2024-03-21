import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Three {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Cat", "Bat");
		
//		for(String word : words) {
//			
//			if(word.endsWith("at")) {
//				
//				System.out.println(word);
//				
//			}
//			
//		}
		
//		System.out.println(words);
		
		List<String> wordAl = new ArrayList<String>(words);
		
//		for(String word : wordAl) {
//			if(word.endsWith("at")) {
//				wordAl.remove(word);
//			}
//			System.out.println(word);
//		}
//		
		
		Iterator<String> iterator = wordAl.iterator();
		
		while (iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		
		System.out.println(wordAl);
		
	}

}

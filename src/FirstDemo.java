import java.util.List;

public class FirstDemo {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Bannana", "Graps");
		
//		List<String> words = List.of();		
//		System.out.println(words);
//		
//		System.out.println(words.size());
//		
//		System.out.println(words.isEmpty());
		
//		for(int i = 0; i<= words.size(); i++) {
//			System.out.println(words.get(i));
//		}
//		
//		System.out.println(words.contains("Dog"));
//		
//		System.out.println(words.contains("Apple"));
		
		System.out.println(words.indexOf("Bannana"));

	}

}

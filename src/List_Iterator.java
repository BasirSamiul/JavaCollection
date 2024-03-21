import java.util.Iterator;
import java.util.List;

public class List_Iterator {

	public static void main(String[] args) {

		List<String> words = List.of("Bannana", "Apple", "Guava");
		try {

			System.out.println("\n--------------------------------\n");

			for (int i = 0; i < words.size(); i++) {
				System.out.println(words.get(i));
			}

			System.out.println("\n--------------------------------\n");

			System.out.println("--------------------------------\n");

			for (String word : words) {
				System.out.println(word);
			}

			System.out.println("\n--------------------------------\n");

			System.out.println("--------------------------------\n");

			Iterator<String> wordsItrerator = words.iterator();

			while (wordsItrerator.hasNext()) {
				System.out.println(wordsItrerator.next());
			}

			System.out.println("\n--------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

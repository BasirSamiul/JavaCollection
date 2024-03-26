package samiul.map.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {

		String str = "This is awesome coding!!! " + " This is too awesome to do coding!!!";

//		Map <Character, Integer> occurances = new HashMap<Character, Integer>();

		Map<String, Integer> occurances = new HashMap<String, Integer>();

		String[] words = str.split(" ");

		for (String word : words) {

			Integer integer = occurances.get(word);

			if (integer == null) {
				occurances.put(word, 1);
			} else {
				occurances.put(word, integer + 1);
			}

		}

//		char[] characters = str.toCharArray();

//		System.out.println(characters);

//		for (char character : characters) {
//			
//			Integer interger = occurances.get(character);
//			
//			if (interger == null) {
//				occurances.put(character,1);
//			}
//			else {
//				occurances.put(character, interger + 1);
//			}
//			
//		}
//		
		System.out.println(occurances);

	}

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_One {

	public static void main(String[] args) {
		
		List<String> words = List.of("Banana", "Apple", "Guava");
		
//		Createing a Arraylist from a list
		List<String> wordsArrayList = new ArrayList<String>(words);
		
//		Creating a LinkedList from a list
		List<String> wordsLinkedList = new LinkedList<String>(words);
		
//		Createing a VectorList from a list
		List<String> wordsVectorList = new Vector<String>(words);
		
		wordsArrayList.add("Coconut");
		System.out.println(wordsArrayList);
		
		wordsLinkedList.add("Hey, I am in LinkedList");
		System.out.println(wordsLinkedList);
		
		wordsVectorList.add("Hey, I am in VectorList");
		System.out.println(wordsVectorList);
		
		
		
	}

}

import java.util.ArrayList;
import java.util.List;

public class List_Two {

	public static void main(String[] args) {
		
		List<String> obj = List.of("Apple", "Bannana", "Fruit");
		
		List<String> objArrayList = new ArrayList<String>(obj);
		
		objArrayList.add(2, "Cocacola");
		
		List<String> newList = List.of("Gulab Jamun", "Naspati");
		
		objArrayList.addAll(newList);
		
//		objArrayList.remove(3);
		
//		objArrayList.remove("Apple");
		
		objArrayList.set(3, "Coral Fish");
		
		System.out.println(objArrayList);
		

	}

}

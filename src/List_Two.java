import java.util.ArrayList;
import java.util.List;

public class List_Two {

	public static void main(String[] args) {
		
		List<String> obj = List.of("Apple", "Bannana", "Fruit");
		
		List<String> objArrayList = new ArrayList<String>(obj);
		
		objArrayList.add(2, "Cocacola");
		
		System.out.println(objArrayList);
		

	}

}

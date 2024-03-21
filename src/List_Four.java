import java.util.List;;

public class List_Four {

	public static void main(String[] args) {
		
//		List value = List.of("A", 'A', 1, 1.0);
//		
//		System.out.println(value);
//		
//		System.out.println(value.get(2) instanceof Integer);
		
		int num = 0;
		
		for( ; num <= 100; num++) {
			
			List<Integer> numbers = List.of(num);
			
			System.out.print(numbers);
			
		}
		
		
		
		
		
	}

}

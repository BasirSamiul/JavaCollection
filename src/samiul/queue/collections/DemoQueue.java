package samiul.queue.collections;

import java.util.*;
import java.util.Comparator;

class StringLength implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		
		return Integer.compareUnsigned(value1.length(), value2.length());
	}
	
}

public class DemoQueue {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>(new StringLength());

		System.out.println(queue.add("Apple"));

		System.out.println(queue.addAll(List.of("Zebra", "Elephant", "Monkey", "Cat")));

		System.out.println(queue);

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}

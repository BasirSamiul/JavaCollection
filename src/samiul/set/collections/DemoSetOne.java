package samiul.set.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DemoSetOne {

	public static void main(String[] args) {

//		Set<Integer> numbers = new HashSet<Integer>();
		
//		Set <Integer> numbers = new LinkedHashSet<Integer>();
		
		Set <Integer> numbers = new TreeSet<Integer>();

		Scanner input = new Scanner(System.in);

		System.out.println("Please, Enter the number how much time you take input: ");
		int inpu_time = input.nextInt();

		for (int i = 0; i < inpu_time; i++) {

			System.out.println("Please, Enter number for adding: ");
			int num = input.nextInt();

			numbers.add(num);
		}
		
		System.out.println("Hello, man your input numbers are: \n" + numbers);

	}

}

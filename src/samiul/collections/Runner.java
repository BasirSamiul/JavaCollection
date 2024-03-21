package samiul.collections;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<Student> students = List.of(

				new Student(01, "Samiul Basir"), new Student(101, "Nurama Akter Nuri"), new Student(02, "Nasima Akter")

		);

		System.out.println(students);

	}

}

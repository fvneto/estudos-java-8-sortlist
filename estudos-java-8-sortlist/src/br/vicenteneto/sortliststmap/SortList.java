package br.vicenteneto.sortliststmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {

		// Adicionando estudades
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Maria", 20));
		list.add(new Student(2, "Suzana", 30));
		list.add(new Student(3, "Natali", 40));
		
		//Student over 30 years old
		List<Student> resultList = list.stream()
				.filter(p -> p.getAge() > 30)
				.collect(Collectors.toList());
		resultList.forEach(p -> System.out.println(p.getName()));
		      
		//People that start with E
		List<Student> resultListWithE = list.stream()
				.filter(p -> p.getName().startsWith("E"))
				.collect(Collectors.toList());
		resultListWithE.forEach(p -> System.out.println(p.getName()));

		//Sorting by Name
		List<Student> slist = list.stream()
				.sorted()
				.collect(Collectors.toList());
		slist.forEach(e -> System.out.println(
				"Id:" + e.getId() + 
				", Name: " + e.getName() + 
				", Age:" + e.getAge()));

		//Sorting by Name in reverse order
		slist = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		slist.forEach(e -> System.out.println(
				"Id:" + e.getId() + 
				", Name: " + e.getName() + 
				", Age:" + e.getAge()));

		//Sorting using Comparator by Age
		// In java 8 Comparator can be instantiated using lambda expression.
		slist = list.stream()
				.sorted(Comparator.comparing(Student::getAge)) 
				.collect(Collectors.toList());
		slist.forEach(e -> System.out.println(
				"Id:" + e.getId() + 
				", Name: " + e.getName() + 
				", Age:" + e.getAge()));

		//Sorting using Comparator by Age with reverse order
		slist = list.stream()
				.sorted(Comparator.comparing(Student::getAge)
				.reversed())
				.collect(Collectors.toList());
		slist.forEach(e -> System.out.println(
				"Id:" + e.getId() + 
				", Name: " + e.getName() + 
				", Age:" + e.getAge()));
	}	
}
package br.vicenteneto.sortliststmap;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
		
public class SortSet {
	
	private static void ordenarInversaIdade(Set<Student> set) {
		System.out.println("---Sorting using Comparator by Age in reverse order---");
		set.stream()
		.sorted(Comparator.comparing(Student::getAge)
				.reversed())
		.forEach(e -> System.out.println("Id:" + 
				e.getId() + 
				", Name: " + e.getName() 
				+ ", Age:"+e.getAge()));
	}

	private static void ordenarPorIdade(Set<Student> set) {
		System.out.println("---Sorting using Comparator by Age---");
		set.stream()
		.sorted(Comparator.comparing(Student::getAge))
		.forEach(e -> System.out.println(
			  "Id:"+ e.getId()
			  + ", Name: " + e.getName()
			  + ", Age:" + e.getAge()));
	}

	private static void ordemInversa(Set<Student> set) {
		System.out.println("---Natural Sorting by Name in reverse order---");
		set.stream()
		.sorted(Comparator.reverseOrder()) // Obs:  Não precisa do .collect(Collectors.toList());
		.forEach(e -> System.out.println(
				"Id:"+ e.getId()
				+ ", Name: "+ e.getName()
				+ ", Age:"+ e.getAge()));
	}

	private static void ordemNatural(Set<Student> set) {
		System.out.println("---Natural Sorting by Name---");
		set.stream()
		.sorted()  // Obs:  Não precisa do .collect(Collectors.toList());
		.forEach(e -> System.out.println(
			"Id:"+ e.getId()+", "
			+ "Name: " + e.getName()
			+", Age:" + e.getAge()));
	}
	
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "Mahesh", 12));
		set.add(new Student(2, "Suresh", 15));
		set.add(new Student(3, "Nilesh", 10));
		
		ordemNatural(set);
		
		ordemInversa(set);		
		
		ordenarPorIdade(set);
		
		ordenarInversaIdade(set);
	}
} 
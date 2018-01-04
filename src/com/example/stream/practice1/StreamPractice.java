package com.example.stream.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static java.util.stream.Collectors.*;

public class StreamPractice {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Jann", 13, Country.POLAND, 92),
				new Student("Anna", 15, Country.POLAND, 95), new Student("Helga", 14, Country.GERMANY, 93),
				new Student("Leon", 14, Country.GERMANY, 97), new Student("Michael", 14, Country.UK, 90),
				new Student("Tim", 15, Country.UK, 91), new Student("George", 14, Country.UK, 98));

		Map<Country, List<Student>> studentsByCountry =
		        students.stream()
		                .collect(groupingBy(Student::getCountry));

		System.out.println(studentsByCountry);
		
		Supplier<StringBuilder> supplier = StringBuilder :: new;
		
		BiConsumer<StringBuilder, Student> accumulator = (sb,student) -> sb.append(student.getName()).append("||");
		
		BiConsumer<StringBuilder,StringBuilder> combiner = (sb1 , sb2) -> sb1.append(sb2);
		
		StringBuilder result = students.stream().collect(supplier, accumulator, combiner);
		System.out.println(result);
		}

}

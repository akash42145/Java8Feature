package com.example.stream.sortMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<User, Address> usermap = new HashMap<>();
		usermap.put(new User(105, "akash", 5000), new Address(303, "india", 400017));
		usermap.put(new User(102, "sagar", 8000), new Address(109, "japan", 700017));
		usermap.put(new User(104, "ramesh", 6000), new Address(238, "singapore", 600017));
		usermap.put(new User(106, "mohan", 4000), new Address(345, "london", 300017));
		usermap.put(new User(101, "babaloo", 2000), new Address(561, "ameriaca", 100017));
		usermap.put(new User(103, "juabloo", 3000), new Address(198, "srilanka", 200017));

		// Before Sort
		displyMap(usermap);

		// 1.Sort Using Key Based on Id
		Map<User, Address> sortById = usermap.entrySet().stream()
				.sorted((u1, u2) -> new Integer(u1.getKey().getId()).compareTo(new Integer(u2.getKey().getId())))
				.collect(Collectors.toMap(u -> u.getKey(), Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		displyMap(sortById);
		// 2.Sort Using Key Based on Salary

		// 3. Sort Using Value Based on Country
		Map<User, Address> sortByCountry = usermap.entrySet().stream()
				.sorted((a1, a2) -> a1.getValue().getCountry().compareTo(a2.getValue().getCountry())).collect(Collectors
						.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));
		
		displyMap(sortByCountry);
		
		LinkedHashMap<User, Address> sortedCountyyMap = new LinkedHashMap<>();
		usermap.entrySet().stream()
		.sorted((a1, a2) -> a1.getValue().getCountry().compareTo(a2.getValue().getCountry())).forEachOrdered(data ->sortedCountyyMap.put(data.getKey() ,data.getValue()));
		displyMap(sortedCountyyMap);
		
		
		Map<User, Address> sortByCountry2 = usermap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue((a1, a2) -> a1.getCountry().compareTo(a2.getCountry()))).collect(Collectors
						.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));
		
		displyMap(sortByCountry2);
		
		// 4. Sort Using Value Based on Pin

	}

	private static void displyMap(Map<User, Address> map) {
		/*for(Map.Entry<User, Address> entry : usermap.entrySet()){
			System.out.println(entry.getKey()+ " :: "+ entry.getValue());
		}*/
		map.forEach( (key,value) -> System.out.println(key+ " :: "+ value));
		System.out.println("====================================================");
		
	}

}

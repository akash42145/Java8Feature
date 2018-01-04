package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;



public class StreamFilterListDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<User> userList= new ArrayList<User>();
		
		Address add1= new Address("Gautam Budha Nagar", "N100", "India", 201301);
		User user1 = new User(101, "User101", "user101@user.com", add1, Arrays.asList(500,502,503,504));
		userList.add(user1);
		
		Address add2= new Address("Noida Sector 121", "H200", "India", 201301);
		User user2 = new User(102, "User101", "user1021@user.com", add2, Arrays.asList(900,902,903,904));
		userList.add(user2);
		userList.add(user2);
		 Address add3= new Address("Noida Sector 121", "H200", "India", 201301);
			User user3 = new User(102, "User1022", "user102@user.com", add2, Arrays.asList(900,902,903,904));
			userList.add(user3);
		
		//Use Stream to filter based on User Id
		 User filteredUser = userList.stream().filter(usr -> 101==usr.getId()).findAny().orElse(null);		
		 System.out.println("-----------------------------------------------");
		 System.out.println(filteredUser);
		 System.out.println(userList.stream().filter(usr -> 102==usr.getId()).collect(Collectors.toList()));
		 

		 
		 System.out.println(userList.stream().map(User::getName).collect(Collectors.toList()));
		 System.out.println(userList.stream().map(ur -> ur.getName()).collect(Collectors.toList()));
		 
		 
		 userList.forEach(p -> {System.out.println(p.getName());});
		 userList.forEach(p -> System.out.println(p.getId()));
		 //System.out.println(userList.stream().map(ur -> ur.getName()).collect(Collectors.toList()));
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("=======================================================================");
		List<Integer> integers = Arrays.asList(1,12,433,5);        
		Optional<Integer> max = integers.stream().reduce( (a,b)->(a >= b) ? a : b ); 		
		//Optional<Integer> max = integers.stream().reduce( Math :: max ); 		 
		max.ifPresent(value -> System.out.println(value)); 
		System.out.println("=======================================================================");
		System.out.println(userList.stream().collect(groupingBy(User::getName)));
		System.out.println(userList.stream().collect(Collectors.groupingBy((User::getName) ,Collectors.groupingBy(User::getId))));
		System.out.println(userList.stream().collect(Collectors.groupingBy((User::getName) ,Collectors.groupingBy(User::getId))));
		
	}

}







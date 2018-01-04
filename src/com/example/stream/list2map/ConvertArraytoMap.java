package com.example.stream.list2map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertArraytoMap {

	public static void main(String[] args) {
		String periodicity = "xyz";
		String refString="return.1684.0.daily,return.44p3.3.daily,dlybegmv.1393.USD,return.1234.0.annually,dlybegmv.1245.EUR,dlybegmv.1441.CAD";
		String [] refStringArr = refString.split(",");
		List<String> refStringList = Arrays.asList(refStringArr);
		
		Map<String ,List<String>> map = new HashMap<>();
		//Before Java 8
		for(String str : refStringArr){
			String key = str.substring(0,str.indexOf("."));
			if(map.get(key)==null){
				List<String> strList= new ArrayList<>();
				map.put(key, strList);
			}
			map.get(key).add(str);
		}
		print(map);
		
		
		//Using java 8 stream
		Map<String ,List<String>> mapJava8 = refStringList.stream().collect(Collectors.groupingBy(str -> str.substring(0,str.indexOf("."))));
		print(mapJava8);
	}

	private static void print(Map<String, List<String>> map){
		for(Map.Entry<String ,List<String>> entry : map.entrySet()){
			System.out.println(entry.getKey() +" :: "+entry.getValue());
		}
		System.out.println("=============================================");
	}
}

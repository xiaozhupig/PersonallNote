package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<>();
		map.put("math", 89);
		map.put("english", 80);
		map.put("java", 60);
		map.put("c", 70);
		Map<String, Integer> map2=new HashMap<>();
		map2.put("js", 90);
		map2.put("c#", 62);
		map.putAll(map2);
		System.out.println(map);
		System.out.println(map.get("c"));
		System.out.println(map.size());
		System.out.println(map.remove("c"));//返回删除的key对应的value值
		System.out.println(map);
		System.out.println(map.containsKey("c"));
		System.out.println(map.containsValue(80));
//		map.clear();
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
		System.out.println("------");
		Set<Map.Entry<String, Integer>> set=map.entrySet();
		Iterator<Map.Entry<String, Integer>> it=set.iterator();
		while(it.hasNext()){
			Entry<String, Integer> entry=it.next();
			System.out.println("科目："+entry.getKey()+"-->成绩："+entry.getValue());
			
		}
		Set<String> ss=map.keySet();
		Iterator<String>it2=ss.iterator();
		while(it2.hasNext()){
			String key=it2.next();
			System.out.println(key+":"+map.get(key));

		}
		 Collection<Integer> cc=map.values();
		 Iterator<Integer>it3=cc.iterator();
		 while(it3.hasNext()){
			 System.out.println(it3.next());
		 }
		
		
		
		
		
	}

}

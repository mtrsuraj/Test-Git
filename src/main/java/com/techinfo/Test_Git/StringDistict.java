package com.techinfo.Test_Git;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringDistict {
	
	public static void main(String[] args) {
		
	

	String name = "aavbdscorev";

    Map<Character, Integer> map = new HashMap();
    
    for(int i = 0; i < name.length(); i++){
        char ch = name.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else map.put(ch, 1);
    }
    System.out.println(map);
    for(Entry<Character, Integer> entrySet : map.entrySet()){
        if(entrySet.getValue()==1){
            System.out.print(entrySet.getKey());
            // break;
        }
    }
    System.out.println();
    
	}
	
}

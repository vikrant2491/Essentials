package com.vikrant.essentials.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyHashMap {

	public static void main(String[] args) {}
	
	public static List<Integer> freqQuery(List<int[]> queries) {
		List<Integer> res = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int[] query: queries){
			int op = query[0];
			int num = query[1];
			switch (op) {
			case 1:
				if(map.containsKey(num))
					map.put(num, map.get(num)+1);
				else
					map.put(num, 1);
				break;
			case 2:
				if(map.containsKey(num) && map.get(num)>0)
					map.put(num, map.get(num)-1);	
				else
					map.remove(num);
				break;
				
			case 3:
				if(map.containsValue(num))
					res.add(1);
				else
					res.add(0);				
				break;

			default:
				break;
			}
		}
		
		return res;

    }

}

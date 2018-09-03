package testing;
import java.util.*;
public class ComparatorTest {
//	public void test(Map<Integer, Integer> map){
//		SortbyValue sorter = new SortbyValue();
//	//Map<Integer, Integer> map = new HashMap<>();
//	List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
//	Collections.sort(list, sorter);
//	
//	}
//	
//	class SortbyValue implements Comparator<Map.Entry<Integer, Integer>> {
//		@Override
//		public int compare(Map.Entry<Integer, Integer> map1, Map.Entry<Integer, Integer>map2) {
//			return map1.getKey() - map2.getKey();
//		}
//		
//	}
//	public static void main(String[] args) {
//		Map<Integer, Integer> map = new HashMap<>();
//		map.put(9, 3);
//		map.put(5, 8);
//		map.put(8, 6);
//		map.put(3, 9);
//		ComparatorTest ct = new ComparatorTest();
//		
//		ct.test(map);
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
//	}
	 public static void main(String[] args) {
	        Map<String, String> map = new TreeMap<String, String>();
	        map.put("a", "ddddd");
	        map.put("b", "bbbbb");
	        map.put("c", "aaaaa");
	        map.put("d", "ccccc");
	        
	        //这里将map.entrySet()转换成list
	        List<Map.Entry<String,String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
	        //然后通过比较器来实现排序
	        Collections.sort(list, new SortbyValue());
	        
	        for(Map.Entry<String,String> mapping:list){ 
	               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
	          } 
	 }
	    
	
}

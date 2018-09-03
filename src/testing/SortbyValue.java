package testing;

import java.util.Comparator;
import java.util.Map;

public class SortbyValue implements Comparator<Map.Entry<String, String>>  {

	@Override
	
	public int compare(Map.Entry<String, String> map1, Map.Entry<String, String>map2) {
			return map1.getValue().compareTo(map2.getValue());
	}
		
	


}

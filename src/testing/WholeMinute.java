package testing;

import java.util.*;
public class WholeMinute {
    public int solution(int[] songs) {
    	int length = songs.length;
    	int count = 0;
    	Set<Integer> set = new HashSet<>();
    	for (int i = 0; i < songs.length; i++) {
    		if (set.contains(60 - songs[i])) {
    			count++;
    			set.remove(60 - songs[i]);
    		} else {
    			set.add(songs[i]);
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args) {
    	 int[] songs = new int[] {10,20,30,60,0, 40, 30, 40};
    	 WholeMinute wm = new WholeMinute();
    	 System.out.print(wm.solution(songs));
        
    }
     
}

package testing;
import java.util.*;

public class LatestStudent {
	public int solution(int[][] time, int[][]student) {
		
		Arrays.sort(time);
		//compute averaghe late time
		int prev = 0;
		int late_time = 0;
		Map<Integer, Integer>map = new HashMap<>();
		for (int i = 0;i < time.length; i++) {
			if (time[i][0] == time[prev][0]) {
				late_time += time[i][3] - time[i][2] < 0 ? 0 : time[i][3] - time[i][2];
				continue;
			} else {
				int length = i - prev;
				int average = late_time / length;
				map.put(time[prev][0], average);
				prev = i;
				late_time = time[i][3] - time[i][2];		
			}
		}
		Arrays.sort(student, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				int a_time = a[1] - map.get(a[0]) < 0 ? 0 : a[1] - map.get(a[0]);
				int b_time = b[1] - map.get(b[0]) < 0 ? 0 : b[1] - map.get(b[0]);
				if (a_time == b_time) {
					return a[0] - b[0];
				}
				return b_time - a_time;
				
			}
		});
		return student[0][0];
		
		
	}	
			
		public static void main (String[] args) {
			
		}
		
	

}

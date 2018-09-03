package testing;
import java.util.*;
public class Denotion {
	public int[] solution(ArrayList<String> orgnization, int[] money) {
		int[] output = new int[orgnization.size()];
        PriorityQueue<Orgnization> pq = new PriorityQueue<>();
        for(String name: orgnization) {
            pq.offer(new Orgnization(name));
        }
        for(int sum: money) {
            Orgnization cur = pq.poll();
            cur.amount+=sum;
            pq.offer(cur);
        }
        while(!pq.isEmpty()) {
            Orgnization cur = pq.poll();
            output[orgnization.indexOf(cur.name)] = (int) cur.amount;
        }
        return output;
    
	}
	 class Orgnization implements Comparable<Orgnization>{
	        String name;
	        double amount;
	         
	        public Orgnization(String name) {
	            this.name = name;
	            this.amount = 0;
	        }
	         
	        @Override
	        public int compareTo(Orgnization o) {
	            if(this.amount - o.amount == 0) {
	                return this.name.compareTo(o.name);
	            }
	            return (int) (this.amount - o.amount);
	        }
	         
	    }

}

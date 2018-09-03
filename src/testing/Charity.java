package testing;
import java.util.*;
public class Charity {
	public  List<String> solution(int[] d) {
		List<String> res = new ArrayList<String>();
		int A_denotion = d[0];
		int B_denotion = d[1];
		int C_denotion = d[2];
		res.add("A");
		res.add("B");
		res.add("C");
		for (int i = 3; i < d.length;i++) {
			String cur = chooseCompany(A_denotion, B_denotion , C_denotion);
			if (cur == "A" ) {
				A_denotion += d[i];
			} else if (cur == "B") {
				B_denotion += d[i];
			} else {
				C_denotion += d[i];
			}
			
			res.add(cur);
		}
		return res;	
	}
	
	public String chooseCompany (int A, int B, int C) {
		if (A <= B && A <= C) {
			return "A";
		} else if (B <= A && B <= C) {
			return "B";
		} else  {
			return "C";
		}
	}
	public static void main (String[] args) {
		int[] d = new int[] {25,8,2,35,15,120,55,42};
		Charity c = new Charity();
		List<String> res = c.solution(d);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

}

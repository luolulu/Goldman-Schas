package testing;
import java.util.*;
public class ReverseEquation {
	public String solution(String input) {
		StringBuilder output = new StringBuilder();
		if (input == null || input.length() == 0) {
			return output.toString();
		}
		
		StringBuilder buffer = new StringBuilder();
		boolean isNumber = true;
		buffer.append(input.charAt(0));
		int index = 1;
		while (index < input.length()) {
			char cur = input.charAt(index);
			//is number
			if (isNumber && (Character.isDigit(cur) || cur == '.')) {
				buffer.append(cur);

			} else if (isNumber && (cur == '+' || cur =='-' || cur == '*' || cur == '/')) {
				output.insert(0, buffer);
				buffer = new StringBuilder();
				buffer.append(cur);
				isNumber = false;
				
			}else if (!isNumber && (cur == '+' || cur =='-')) {
				output.insert(0, buffer);
				buffer = new StringBuilder();
				buffer.append(cur);
				isNumber = true;
			} else if (!isNumber && Character.isDigit(cur)) {
				output.insert(0, buffer);
				buffer = new StringBuilder();
				buffer.append(cur);
				isNumber = true;
			}
			index++;
					
		}
		if (buffer != null) {
			output.insert(0, buffer);
		}
		return output.toString();
	}
	
	 public static void main(String[] args) {
    	 String test = "1+2*7--7.68+-9";
    	 
    	 ReverseEquation re = new ReverseEquation();
    	 System.out.print(re.solution(test));
    }

}

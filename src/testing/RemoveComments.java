package testing;
import  java.util.*;

public class RemoveComments {
	public List<String> solution(String[] sources) {
		List<String> res = new ArrayList<String>();
		if (sources == null || sources.length == 0) {
			return res;
		}
		StringBuilder sentence = new StringBuilder();
		StringBuilder afterStart = new StringBuilder();
		boolean mode = false;
		for (String s : sources) {
			for(int i = 0; i < s.length(); i++) {
				if (mode) {
					if (s.charAt(i) == '*' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
						mode = false;
						i++;
						afterStart = new StringBuilder();
					} else if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
						break;
				    }else {
				    	afterStart.append(s.charAt(i));
				    }
				}else {
					if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
						break;
					} else if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '*') {
						mode = true;
						i++;
					} else {
						sentence.append(s.charAt(i));
					}
				}
			}
			if (!mode && sentence.length( )> 0) {
				res.add(sentence.toString()+ "\n");
				sentence = new StringBuilder();
			}
			if (mode && afterStart.length() > 0) {
				afterStart.append("\n");
			}
		}
		if (mode && afterStart.length() > 0) {
			res.add(afterStart.toString()+"\n");
		}
		return res;
	}
	
	public static void main(String[] args) {
		String[] sources = new String[] {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "  // comment for ", "   testing", "a = b + c;","}"};
		RemoveComments rc = new RemoveComments();
		List<String> res = rc.solution(sources);
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i));
		}
	}

}

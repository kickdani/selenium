package Method;
import java.util.*;

public class Strg {
	public static void main (String[]args) {
		String s ="Welcom to Java Program";
		char[] t = s.toCharArray();
		Map<Character,Integer> p =new LinkedHashMap<>();
		
		for(char c:t) {
			if(p.containsKey(c)) {
				Integer x =p.get(c);
				p.put(c, x+1);
			}
			else {
				p.put(c, 1);
			}
		}
		System.out.println(p);
	}

}

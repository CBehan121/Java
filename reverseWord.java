import java.util.*;
import java.lang.*;

public class reverseWord{
	public static void main(String [] args ){
		String s = "hello";
		String m = "";
		for(int i = 0; i < s.length(); i++){
			m = s.charAt(i) + m;
		}
		System.out.println(m);
	}
	
}
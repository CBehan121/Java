import java.util.*;
public class Maps{
	public static void main(String [] args){
		Scanner limb = new  Scanner(System.in);
		String in = limb.next();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while(!"frog".equals(in)){
		
		Integer count = map.get(in);
		if (count != null){
			map.put(in, count + 1);

		}
		else{
			map.put(in, 1);
		}
		in = limb.next();
	}
	System.out.println(map);
	}
	
}
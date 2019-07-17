import java.util.*;
public class MakeMap{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println(MakeMap(in));
	}
	public static Map MakeMap(Scanner input){
		Map<String, Integer> map = new HashMap<String, Integer>();
		String a =  input.next();
		int b = input.nextInt();
		while(!"frog".equals(a)){
			map.put(a, b);
			a = input.next();
			b = input.nextInt();
		}
		return map;
	}
}
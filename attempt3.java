import java.util.*;
import java.lang.*;
public class attempt3{
	public static int[] reverse(int[] listh){
		int [] log= new int[listh.length];
		int j  = 0;
		for(int i = listh.length-1; i >=0; i--, j++){
			log[i] = listh[j];
		
		} 
		return(log);
	}
	public static void main(String [] args){
		int [] log = {2,3,4,6,7,8};
		System.out.println(Arrays.toString(reverse(log)));
	}
}
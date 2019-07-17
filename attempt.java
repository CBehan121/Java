import java.io.*; 
import java.util.*; 
public class attempt{
	public static int[] reverse(int listh[]){
		int[] b = new int[listh.length];
		
		int j =  listh.length - 1;
		int l = j;
		
		for(int i = 0; i <= l; i++){
			b[j] = listh[i];
			j = j - 1;
		
			;
		}
		return(b);
	}
	public static void main(String [] args){
		int [] arrayw = {2, 3, 5, 7, 11, 13, 17};
		
		
		System.out.println(Arrays.toString(reverse(arrayw)));
		
		

	}
	
}

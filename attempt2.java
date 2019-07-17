import java.lang.*;
import java.io.*;
import java.util.*;
public class attempt2{
	public static Boolean check(String one, String two){
		if(one.length() == two.length()){
			int i = 0;
			int j = 0;
			while(i < one.length()){
				char letter1 = one.charAt(i);
				char letter2 = two.charAt(two.length()-i-1);
				if(letter1 == letter2){
					j++;
				}
				
				i++;
				
			}
			return(j == one.length());
		}
		return(false);
	}
	public static void main(String [] args){
		String log =  "hello";
		String log1 = "ollek";

		System.out.println(check(log, log1));
	}
}
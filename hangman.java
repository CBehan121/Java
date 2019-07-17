import java.lang.*;
import java.util.*;
public class hangman{
	public static void main(String [] args)    {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a word and some guesses: ");
			String word = in.next();        
			String guessed = in.next();
			if(allDone(word, guessed))            
				System.out.println("You got all the letters!");        
			else            
				System.out.println("Keep guessing!");    
		}
	public static boolean allDone(String word, String guess){
		int j = 0;
		for(int i = 0; i < guess.length(); i++){
			char c = guess.charAt(i);
			
			if (word.indexOf(c) != -1)
				j = j + 1;
			if(j == word.length()){
				return true;
			}
		
		}
		System.out.println(j);
		
		return false;

	}
}	

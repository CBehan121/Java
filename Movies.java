import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Movies
{
    public static void main(String [] args) throws FileNotFoundException
    {
    	

    	String wholefile = "";
        Scanner revs = new Scanner(new File(args[1]));
        while(revs.hasNext())
        {
        	String lines = revs.next();
        	wholefile = wholefile + lines;

        	
            // Now you can read in a line with Scanner's nextLine() method and you can
            // read in an int with the nextInt() method.
        }
        int count = 0;
        int index = wholefile.indexOf(args[0]);
      
        while(index >= 0){
        	count++;
     
        	index = wholefile.indexOf(args[0], index + 1);
        }
        System.out.println("The word "+  args[0] + " occurs " + count +  " times.");
    }
}
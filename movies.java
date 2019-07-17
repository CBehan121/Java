import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Movies
{
    public static void main(String [] a) throws FileNotFoundException
    {
        File movieReviewFile = new File("reviews.txt");
        Scanner moveReviewScanner = new Scanner(movieReviewFile);
        while(moveReviewScanner.hasNext())
        {
        	Scanner line = new Scanner(moveReviewScanner.nextLine());
        	System.out.println(line);
            // Now you can read in a line with Scanner's nextLine() method and you can
            // read in an int with the nextInt() method.
        }
    }
}
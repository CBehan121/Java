import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class trying
{
    public static void main(String [] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        String filename = in.next();
        in = new Scanner(new File(filename));
        while(in.hasNext())
        {
            String line = new nextLine();
            System.out.println(line);
            // Now you can read in a line with Scanner's nextLine() method and you can
            // read in an int with the nextInt() method.
        }
}
}
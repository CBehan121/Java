import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
public class Senti2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String word = args[0];
        Scanner filename = new Scanner(new File(args[1]));
        int rowcount = 0;
        int occurence = 0;
        double total = 0;
        
        while(filename.hasNextLine()){
            String line = filename.nextLine();
            if (line.indexOf(" " + word) >= 1){
                 rowcount += 1;
                 total += Integer.parseInt(line.substring(0,1));
                 int index = line.indexOf(word);
                while(index >= 0){
                    occurence += 1;
                    index = line.indexOf(word, index + 1);

                }
            }
            
        }

        
        
        System.out.println("The word " + word + " occurs " + occurence + " times.");
        System.out.println("The average score of the reviews containing " + word + " is "+  String.format("%.2f", (total/rowcount)));
        
        
        
    }
}
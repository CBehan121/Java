import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Senti3
{
    public static double score(String filename , String word)throws FileNotFoundException{  
    Scanner file2 = new Scanner(new File(filename));
    double currentlinecount = 0;
    double count = 0;
    double rows = 0.0;
    double score = 0.0;
    while(file2.hasNextLine()){
        currentlinecount = 0;
        String lines2 = file2.nextLine();
        int index = lines2.indexOf(" " + word);
        while(index >= 0){;
            count++;
            currentlinecount++;
            index = lines2.indexOf(" " +word, index +1);
        }  
        if(lines2.indexOf(" " + word) >= 0){
            score += (Integer.parseInt(lines2.substring(0,1)) / currentlinecount);
            rows++;
        }

    }
    return (score/rows);      
    

}
    public static void main(String [] args) throws FileNotFoundException{
            Scanner file1 = new Scanner(new File(args[0]));
            
            String line = file1.nextLine();
            String [] parts = line.split(" ");
            for(int i = 0; i < parts.length; i++){
                if(score(args[1],parts[i]) == 0.0){
                    System.out.println("The score of "+ parts[i] + " is 0.0.");
                }
                else{
                System.out.println("The score of " + parts[i] + " is " +score(args[1], parts[i])+ "."); 
                }  
            }
            

    }
        
}
    
    


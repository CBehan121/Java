import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class take2 
{
  public static void main(String [] args) throws FileNotFoundException
  {
    //File filename = new File("names.txt");
    //Scanner in = new Scanner(filename);
    Scanner in = new Scanner(System.in);
    System.out.print(" Enter the file name: ");
    String filename = in.next();
    in = new Scanner(new File(filename));

    int lenOfFile = in.nextInt();
    String [] names = new String[lenOfFile];
    for(int i = 0; i < lenOfFile; i++)  
      names[i] = in.next();
    //Print the names i reverse order
    System.out.println("The names in reverse order are:");

    for(int i = lenOfFile - 1; i >= 0; i--)
      System.out.print(names[i] + " ");
    System.out.println(); 

  }

}
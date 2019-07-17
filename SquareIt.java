import java.util.Scanner;
import java.lang.Math;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = (int) Math.pow(num, 2);

        System.out.println("Enter a number: " + num + " squared is " + result);
        //System.out.print(num + " squared is " + result);
     
    }
}

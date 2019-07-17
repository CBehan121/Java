import java.util.Scanner;
import java.lang.Math;
public class squaring
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int result =(int)  Math.pow(in.nextInt(), 2);
		System.out.println("Your number squared is; " +  result);
	}
}


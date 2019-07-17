import java.util.Scanner;
public class OnlyAverage{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		double sumlist = 0;
		double[] listsh;
		listsh = new double[4];
		for(int i = 0; i < 4; i++)
		{
		double j = in.nextDouble();
		listsh[i] = j; 
		sumlist = sumlist + j;
		}
		double average = sumlist / listsh.length;
		System.out.println(average);
	}
}

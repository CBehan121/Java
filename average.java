import java.util.Scanner;
public class OnlyAverage{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		double sumlist = 0;
		double [] listsh;
		for(int i = 0; i < 4; i++)
		{
		double j = in.nextDouble();
		listsh[i] = j; 
		sumlist = sumlist + j;
		}
		double average = listsh.length + sumlist;
		System.out.println(average);
	}
}

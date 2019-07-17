import java.util.Scanner;
public class AboveAverMeth{
	static double Aver(double [] listsh, int lenght){
	double average = 0;
	for(int i = 0; i < lenght; i++)
	{
		average = listsh[i] + average;
	}
		return(average / lenght);

	}
	static void aboveAver(double [] listsh, int lenght)
	{
		double averageboi = Aver(listsh, length);
		for(int i = 0; i < lenght; i++)
		{
			if(listsh[i] > averageboi)
				System.out.print(listsh[i] + " ");

		}
	}
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		double [] listyboi;
		listyboi = new double [4];
		for(int i = 0; i < 4; i++)
		{
			double j = in.nextDouble();
			listyboi[i]= j;
		}
		aboveAver(listyboi, 4);
	}
}

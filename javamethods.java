import java.util.Scanner;
public class AboveAverage{

	static void aboveAVG(double [] intarray, int length){
		double average = Avg(intarray, length);
		for(int i = 0; i < length; i ++){
			if(intarray[i] > average){

				System.out.print(intarray[i] + " ");

			}
		}

		System.out.println();
	}


	static double Avg(double [] intarray, int length){

		double total = 0;
		for(int i = 0; i < length; i ++){

			total = total + intarray[i];

		}

		double result = total / length;
		return result;




	}

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		double [] numbers;
		numbers = new double[len];
		for(int i = 0; i < len; i ++){
			int current = in.nextInt();
			numbers[i] = current;
		}
		aboveAVG(numbers, len);


	} 


}
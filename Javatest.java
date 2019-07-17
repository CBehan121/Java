public class Javatest{
	public static void main(String [] args){
	int [] num = {2, 3, 5, 7, 11, 13, 17, 5, 0, -5, 5};
	// Call the method to count the fives
	int result = countFives(num);
	System.out.println(result);
	}
	static int countFives(int [] listyboi){
		int count = 0;
		int len = listyboi.length;
		for(int i = 0; i < len; i++)
		{
			if(listyboi[i] == 5)
				count++;
		}
		return count;
	}
}

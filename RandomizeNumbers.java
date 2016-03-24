import java.util.Random;
import java.util.Scanner;


public class RandomizeNumbers {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int N,M;
		
		N = Input.nextInt();
		M = Input.nextInt();
		
		RandomizeArray(N, M);

		Input.close();

	}
	public static int[] RandomizeArray(int a, int b){
		Random rgen = new Random();  // Random number generator		
		int size = b-a+1;
		int[] array = new int[size];
 
		for(int i=0; i< size; i++){
			array[i] = a+i;
		}
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		for(int s: array)
			System.out.print(s+" ");
 
		return array;
	}

}

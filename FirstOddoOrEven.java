import java.util.Arrays;
import java.util.Scanner;

public class FirstOddoOrEven {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		String A[] = Input.nextLine().split(" ");
		
		
		int B[] = new int[A.length];
		
		for(int i = 0;i < A.length; i++)
			B[i] = Integer.parseInt(A[i]);
		
		String OddEven = Input.nextLine();
		
		int n = Integer.parseInt(OddEven.split(" ")[1]);
		
		int oddoreven=0;
		if(OddEven.contains("odd"))
			oddoreven = 1;
			for(int i = 0,j=0;i<n;j++)
				if(B[j]%2==oddoreven)
				{
					System.out.print(B[j]+" ");
					i++;
				}
			
		Input.close();
	}

}

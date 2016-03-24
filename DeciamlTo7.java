import java.util.Scanner;

public class DeciamlTo7 {
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		long B10 = Input.nextLong();
		String B7 = Long.toString(B10,7);
		
		System.out.println(B7);
		Input.close();
	}
}

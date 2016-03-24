import java.util.Scanner;

public class RectangleArea {
	public static void main(String [] args)
	{
		Scanner Input = new Scanner(System.in);
		int a = Input.nextInt();
		int b = Input.nextInt();
		
		System.out.println(a*b);
		
		Input.close();
	}
}

import java.util.Scanner;

public class Calculateexpression {
	
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		
		double a,b,c;
		
		a = Input.nextDouble();
		b = Input.nextDouble();
		c = Input.nextDouble();
		
		double F1 = Math.pow((a*a+b*b)/(a*a-b*b),(a+b+c)/Math.sqrt(c));
		double F2 = Math.pow((a*a + b*b - c*c*c), a-b);
		
		double Avgabc = (a+b+c)/3;
		double Avg = Avgabc - (F1+F2)/2;
		
		System.out.printf("F1 result: %.2f F2 result: %.2f Diff: %.2f",F1,F2,Math.abs(Avg));
		
		Input.close();
	}
}

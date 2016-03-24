import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int a;
		double b,c;
		
		
		a = Input.nextInt();
		b = Input.nextDouble();
		c = Input.nextDouble();
		String B = String.format("%.2f", b);
		String C = String.format("%.3f", c);  // new string(' ',5);
		
		String ahex = Integer.toHexString(a).toUpperCase();
		String abin = Integer.toBinaryString(a);
		if(abin.length()<10)
			abin = new String(new char[10-abin.length()]).replace('\0', '0') + abin;
		
		String FirstSpaces = new String(new char[10-ahex.length()]).replace('\0', ' ');
		String SecondSpaces = new String(new char[10-B.length()]).replace('\0', ' ');
		String ThirdSpaces = new String(new char[10-C.length()]).replace('\0', ' ');
		
		System.out.println("|"+ahex + FirstSpaces + "|" +abin +"|" + SecondSpaces + B + "|" + C + ThirdSpaces + "|");
		
		Input.close();
	}
	
}

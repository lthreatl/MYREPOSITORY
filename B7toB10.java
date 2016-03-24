import java.util.Scanner;

public class B7toB10 {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		String B7 = Input.nextLine();
		
		int decimalValue = Integer.parseInt(B7, 7);
		
		System.out.println(decimalValue);

		Input.close();
	}

}

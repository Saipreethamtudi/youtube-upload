import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner Str = new Scanner(System.in);
		String value = Str.nextLine();
		countnumbers(value);
		
	}
	
	public static void countnumbers(String value) {
		
		System.out.println(value.length());
		
	}

}

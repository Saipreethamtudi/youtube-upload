import java.util.Scanner;

public class checknumber {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int S1 = S.nextInt();
		int S3 = S.nextInt();
		
		checkvalue(S1,S3);

	}

	private static void checkvalue(int S1, int S3) {
	
	String S2 = Integer.toString(S1);
	String s4 = Integer.toString(S3);
	int C = 0;
	for(int i=0;i<S2.length();i++) {
		
		char ch = S2.charAt(i);
		char ch1 = s4.charAt(0);
	   if(ch == ch1 ){
		   
			C++;
	   }
		
		}
		System.out.println(C);
	}
		
	}



import java.util.Scanner;

public class StringEx4 {
	public static String frontBack(String str){
		String first;
		String last;
		String middle;
		
		first = str.substring(0, 1);
		last = str.substring(str.length() - 1);
		middle = str.substring(1, str.length() - 1);
		
		return last + middle + first;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter a string: ");
		inputStr = input.nextLine();
		
		System.out.println(frontBack(inputStr));
		
		input.close();
	}
}

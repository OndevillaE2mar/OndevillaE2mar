// Reverse Text
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String text = " ";
		text = in.nextLine();

		char[] letters = new char[text.length()];
		
		int write = 0;
		for(int i = text.length() -1; i>= 0; i--) {
			letters[write] = text.charAt(i);
			write++;
		}
        String reverse = "";
        for (int i = 0; i < text.length(); i++ ) {
            reverse = reverse + letters[i];
        }
        
        System.out.println(reverse);
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text:");
		String exmpl = input.nextLine();
		
		String[] parts = exmpl.split("\\s+");
		Arrays.sort(parts);
		StringBuilder sb = new StringBuilder();
		for (String s : parts) {
			sb.append(s);
			sb.append(" ");
		}

		String sorted = sb.toString().trim();
		System.out.println(sorted);
		input.close();
	}
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter words: ");
		String text = in.nextLine();

		String[] words = text.split(" ");

		List<String> wordList = new ArrayList<String>();

		for (String word : words) {
			wordList.add(word);
		}
		Set<String> oneWord = new HashSet<String>(wordList);
		for (String word : oneWord) {
			System.out.println(word);

			in.close();
		}
	}

}
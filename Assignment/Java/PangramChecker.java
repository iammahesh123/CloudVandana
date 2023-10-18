import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("Input is a pangram.");
        } else {
            System.out.println("Input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        Set<Character> letterSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }
        return letterSet.size() == 26;
    }
}

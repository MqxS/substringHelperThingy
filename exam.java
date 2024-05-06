import java.util.*;

public class exam {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] letters = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        while(true) {
            final StringBuilder word = new StringBuilder();
            for (int i=0; i < 17; i++) {
                word.append(letters[(int) (Math.random() * 26)]);
            }
            
            int start = 0;
            int end = 0;
            while (start == end || start > end) {
                start = (int) (Math.random() * word.length());
                end = (int) (Math.random() * word.length());
            }

            final String result = word.substring(start, end);

            System.out.println("\"" + word + "\".substring(" + start + ", " + end + ")");
            System.out.print("Enter your answer: ");
            final String input = scanner.nextLine();

            System.out.println("RESULT: " + result.equals(input) + " | " + result);
            System.out.println();
        }
    }
}

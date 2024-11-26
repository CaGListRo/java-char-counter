
import java.nio.file.*;
import java.io.IOException;
import java.util.TreeMap;

public class LetterCounter {

    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("Java The Coffee of Programming Languages.txt");
            String content = Files.readString(filePath);

            char[] characters = content.toCharArray();

            // TreeMap with generics
            TreeMap<String, Integer> charsInDocument = new TreeMap<>();

            int charCount = 0;
            int letterCount = 0;

            for (char c : characters) {
                // Convert the char to a readable key
                String key;
                if (c == '\n') {
                    key = "\\n"; // Replace Newline with "\\n"
                } else if (c == '\r') { // For Windows-Carriage Return
                    //continue;  // Windows systems use \r\n for new line
                    key = "\\r";
                } else {
                    key = String.valueOf(c);
                    if (Character.isLetterOrDigit(c)) {
                        letterCount++;
                    } else {
                        charCount++;
                    }
                }

                // Test key and set or increment value
                charsInDocument.put(key, charsInDocument.getOrDefault(key, 0) + 1);
            }

            // Print TreeMap and summary
            System.out.println(charsInDocument);
            System.out.printf("There are %d letters or numbers in the document.%n", letterCount);
            System.out.printf("There are %d special characters in the document.%n", charCount);
            System.out.printf("That makes a total of %d characters in the document.%n", charCount + letterCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

import java.util.HashSet;
public class Permutaion {
        // Method to generate permutations
        public static void permute(String str, String result, HashSet<String> allWords) {
            // Base case: if no characters are left, add the result to the set
            if (str.length() == 0) {
                allWords.add(result);
                return;
            }
    
            // Loop through each character
            for (int i = 0; i < str.length(); i++) {
                // Create a new string by removing the current character
                String newStr = str.substring(0, i) + str.substring(i + 1);
                // Recur with the new string and add the current character to the result
                permute(newStr, result + str.charAt(i), allWords);
            }
        }
    
        public static void main(String[] args) {
    
            // The input characters
            String[] name = {"A","A","C"};
            String input = String.join("", name);  // Join the array to make one string
    
            // To avoid duplicate words, we use a HashSet
            HashSet<String> allWords = new HashSet<>();
    
            // Generate permutations
            permute(input, "", allWords);
    
            // Print all unique words
            for (String word : allWords) {
                System.out.println(word);
            }
        }
    
}

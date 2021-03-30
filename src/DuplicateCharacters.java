/*
Question 3 - Counting Duplicate Characters
Problem: Write a method that finds out the duplicate characters in a String.

BONUS

Create a separate definition class for this task.
Create a separate method for this task.
[]

*/
import java.util.HashMap;
import java.util.Map;

class DuplicateCharacters {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        Integer response = 1;
        var resultMap = new HashMap<Character, Integer>(); //a hashmap to store count all of the characters

        var duplicateCharacters = new HashMap<Character, Integer>(); //a hashmap to store count of duplicate characters

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isWhitespace(string.charAt(i))) {
                Integer h = resultMap.get(string.charAt(i));

                if (h != null) {
                    Integer r = resultMap.get(string.charAt(i)) + 1;
                    resultMap.put(string.charAt(i), r);
                    duplicateCharacters.put(string.charAt(i), r); //adding the characters in duplicateCharacters hashmap only if the character is repeated in the string
                } else {
                    resultMap.put(string.charAt(i), response);
                }
            }
            // write your code here ...


        }
        return duplicateCharacters;
    }
    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}
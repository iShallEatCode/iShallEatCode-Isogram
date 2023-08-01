import java.util.HashSet;
import java.util.Set;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there
     * will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg",
     * "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to
     * solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters
     * to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as
     * easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str) {

        // Comments below are from the web for my own reminder.
        // A Set is a collection that does not allow duplicate elements
        // A HashSet implementation of the Set interface uses a hash table to store
        // elements, which provides fast access times for inserting, deleting, and
        // searching elements.

        Set<Character> seenCharacters = new HashSet<>();

        // Iterate through each character in the input string.
        for (char ch : str.toCharArray()) {
            if (seenCharacters.contains(ch)) {
                return false;
            } else {
                seenCharacters.add(ch);
            }
        }
        return true;
    }
}

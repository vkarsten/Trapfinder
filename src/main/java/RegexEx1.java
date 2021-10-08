package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEx1 {
    public static void main(String[] args) {
        // Demo
        //Defining the String to be checked
        String str = "there is a traP";

        // Printing the result of the findTrap() method
        System.out.println(findTrap(str));
    }

    /**
     * Write a function that finds the word "trap" in the given string (not case sensitive). Return "BOO!!" if found, otherwise,"Relax, there's no trap.".
     *     Examples
     *     trap("There is a trap.") ➞ "BOO!!"
     *
     *     bomb("Hey, did you think there is a TRAP?") ➞ "BOO!!"
     *
     *     bomb("This goes traaa!!!") ➞ "Relax, there's no trap."
     *     Notes
     *     The string "trap" may appear in different character cases (i.e. uppercase, lowercase, mixed).
     * @param sourceText: type of String, the method checks if it contains the word "trap"
     * @return type of String: a message telling you if a trap was found or not
     */
    public static String findTrap(String sourceText) {
        // compile the regex "trap" as a Pattern
        Pattern trap = Pattern.compile("trap");

        // Create a matcher to check the pattern against the source text
        // the source text is converted to lower case for this purpose
        Matcher trapFinder = trap.matcher(sourceText.toLowerCase());

        // returning BOO if a match is found
        return trapFinder.find() ? "BOO" : "Relax, there's no trap.";
    }

}

package main.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEx2 {
    public static void main(String[] args) {
        // Demo
        // Defining the string from which the vowels will be removed
        String str = "Happy Thanksgiving to all--even the haters and losers!";
        // Printing the modified string
        System.out.println(removeVowels(str));
    }

    /**
     * a function that takes a string and returns a new string with all vowels removed. “y” is not considered a vowel.
     * @param sourceText: type of String, the text from which the vowels will be removed
     * @return newText: type of String, the same text without vowels
     */
    public static String removeVowels(String sourceText) {
        // Defining the new string that will be returned
        String newText = sourceText;

        // Defining a regex for both lower case and upper case vowels and compiling it into a pattern.
        Pattern vowels = Pattern.compile("[aeiouAEIOU]");
        // Creating a matcher to match the regex with source text
        Matcher vowelFinder = vowels.matcher(newText);

        // Replacing the vowel we found with an empty string as long as we find vowels
        while (vowelFinder.find()) {
            newText = newText.replace(vowelFinder.group(), "");
        }

        // Returning the new modified string
        return newText;
    }
}

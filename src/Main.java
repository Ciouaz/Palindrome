public class Main {
    public static void main(String[] args) {

        System.out.println("Program checks if the word or sentence is palindrome. " +
                "It works even for palindromes with punctuation symbols.");

        IsPalindrome isPalindrome = new IsPalindrome("Kajak");
        new IsPalindrome("Dupa");
        new IsPalindrome("A");
        new IsPalindrome("2137");
        new IsPalindrome("12345678987654321");
        new IsPalindrome("A to Kamela, ale ma kota");
        new IsPalindrome("Dammit, I'm mad");
        new IsPalindrome("Do geese see God?");
        new IsPalindrome("Anne, I vote more cars race Rome to Vienna");
        new IsPalindrome("O, mam karabin i barak mamo!");
        new IsPalindrome("This sentence isn't palindrome");

    }
}
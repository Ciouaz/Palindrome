public class IsPalindrome {

    IsPalindrome(String word) {
        //defining empty string to hold reverse word
        String reverseWord = "";

        //creating reverse word
        for (int i = (word.length() - 1); i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        //array to hold replacements
        String[][] replacements = {{",", ""}, {" ", ""}, {".", ""},
                {"'", ""}, {"?", ""}, {"!", ""}, {":", ""}, {";", ""}};

        //loop over the array and replace
        String wordRep = word.toLowerCase();
        String revWordRep = reverseWord.toLowerCase();

        for(String[] replacement : replacements) {
            wordRep = wordRep.replace(replacement[0], replacement[1]);
            revWordRep = revWordRep.replace(replacement[0], replacement[1]);
        }

        //prining results
        System.out.println(wordRep.equals(revWordRep) ?
                ("Word \"" + word + "\" is palindrome") : ("Word \"" + word +  "\" isn't palindrome"));
    }
}

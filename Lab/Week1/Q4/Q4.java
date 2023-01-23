package Lab.Week1.Q4;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(countWords("a star is born"));
        System.out.println(countWords("Write and test a method public static int countWords(String str) that returns a count of all the words in the string str. Words are separated by spaces. E.g  countWords(“A Star Is Born”) should return 4. Use whatever methods of String class you wish (but do not use not regular expressions)."));
        System.out.println(countWords(""));
    }

    public static int countWords(String str){
        if (!str.isBlank()) return str.split(" ").length;
        return 0;
    }
}

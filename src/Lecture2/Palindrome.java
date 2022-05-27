package Lecture2;

public class Palindrome {

    /**
     Метод, проверяющий, является ли заданная строка палиндромом.
     Палиндромом называется строка, которая читается одинаково слева направо и справа налево
     (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры.
     А пробелы, знаки препинания, а также регистр символов должны игнорироваться.
     Гарантируется, что в метод попадают только строки, состоящие из символов ASCII
     (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов
     в строке не будет.
     */

    public static boolean isPalindrome(String text) {
        String correctText = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reversedText = new StringBuilder(correctText);
        reversedText = reversedText.reverse();
        return (correctText.equalsIgnoreCase(reversedText.toString()));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("232uuuuuu"));
    }
}

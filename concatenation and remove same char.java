/*
Given two strings, append them together (known as "concatenation") and return the result. However,
 if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".



conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = str.nextLine();
        System.out.println("Enter second string");
        String s2 = str.nextLine();


        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            System.out.println(s1 + s2.substring(1));

        }
        else
        {
            System.out.println(s1+s2);

       }}}

package me.cameronwhyte.learning;

public class Main {

    /*
    A char occupies two bytes of memory, or 16 bits and so it has a width of 16.
    Its not a just a single byte because it allows you to store unicode characters.

    Unicode is an international encoding standard for use with different languages and scripts.
    This means each letter, digit or symbol is assigned a unique numeric value that applies across different platforms and programs.

    In English we has letters A to Z, this means we only have 26 characters needed in total to represent our alphabet.
    Other languages need more characters, in places like China and Japan you often need a lot more.

    Unicode allows us to represent languages and the way it works is that by using a combination of 2 bytes.
    A char takes up this memory and can represent one of 65525 different types of characters.
     */
    public static void main(String[] args) {

        char myChar = 'D'; //Single Quotes are char and not a String literal. These can only store one character.
        char myUnicode = '\u0044';
        System.out.println(myChar + " = " + myUnicode);
        char copyright = '\u00A9';
        System.out.println("Copyrighted " + copyright + " cameronwhyte.me");

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        System.out.println("Is customer over 21? " + isCustomerOverTwentyOne);
    }
}

package me.cameronwhyte.learning;

public class Main {

    /*
    A String is a data type in Java, it is not a primitive type.
    It's actually a class, but it's easier to use than a regular class.

    A String is a sequence of characters.
    A String is limited to the max value of an int, which is 2.14 Billion characters.

    String in Java are immutable, this means you cannot change a String after its created.
    Instead what happens is a new String is created.

    A StringBuffer can instead be changed.
     */
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2020"; //Char unicode characters can be used in strings.
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95"; //Even though its an integer, its still held in a String so it treats as text only.
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //If a int is added to a string, the int is converted to a string.
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; //This can go for any number data type.
        System.out.println("LastString is equal to " + lastString);
    }
}

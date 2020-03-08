package me.cameronwhyte.learning;

public class Main {

    public static void main(String[] args) {
        integer();
    }

    private static void integer() {

        int myValue = 10000;//int - a primitive type, set a data type

        int myMinIntValue = Integer.MIN_VALUE;//Integer - Perform actions on an int
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        /*
        If you try to do a value large or smaller than the maximum or minimum value
        it would have an overflow and loop around.
         */
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;
        int myMinIntTest = -2147483648;
    }
}

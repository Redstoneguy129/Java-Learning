package me.cameronwhyte.learning;

public class Main {

    public static void main(String[] args) {

        Integer();
        Byte();
        Short();
        Long();

        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
    }

    private static void Integer() {

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

    private static void Byte() {

        byte myValue = 127;//byte - a primitive type, set a data type

        byte myMinByteValue = Byte.MIN_VALUE;//Byte - Perform actions on an byte
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
    }

    private static void Short() {

        short myValue = 32767;//short - a primitive type, set a data type

        short myMinShortValue = Short.MIN_VALUE;//Short - Perform actions on an short
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
    }

    private static void Long() {

        long myValue = 9223372036854775807L;//long - a primitive type, set a data type

        long myMinLongValue = Long.MIN_VALUE;//long - Perform actions on an long
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
    }
}

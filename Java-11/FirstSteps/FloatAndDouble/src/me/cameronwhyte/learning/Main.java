package me.cameronwhyte.learning;

public class Main {

    /*
    Float and Double are great for general floating point operations.
    But both are not great to use where precise calculations are required.
    This is due to a limitation with how floating point numbers are stored.
    This is not a Java problem though.

    Java has a class called BigDecimal that overcomes this limitation.
     */
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds*.45359237D;
        System.out.println("Converted kilograms = " + kilograms);

        double pi = 3.1415927D;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println("Pi = " + pi);
        System.out.println("Another number = " + anotherNumber);
    }
}

public class Hello {

    /*
    Main method - Java will always look for the main method.
    Curly Brackets {} - These define the CODE BLOCKS.
     */
    public static void main(String[] args) {
        System.out.println("Hello, Cameron"); //Code in methods are called statements. Expressions are the constructs that evaluates to a single value, these generally go in the method parameters.

        int myFirstNumber = (10 + 5) + (2 * 10); //Declaration statement, Declaration statements are to define a variable by indicating the data type. The data type here is an int, the int is short for integer and it can only hold numbers.
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal); //Outputs the value held by the variable.
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}

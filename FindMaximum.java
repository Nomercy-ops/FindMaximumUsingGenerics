/**
 *
 * @author Rikesh Chhetri
 * Created On: 11.06.21
 *
 * Purpose: To  find maximum of Integer numbers, Strings, Double using java Generics
 *
 */
package com.bridgelabz.generics;


public class FindMaximum {
    
/**
 * Refactor-1 making one One Generic Method and finding the maximum ensuring
 * generic is extended to comparable.
 *
 *
     * @param <E>
     * @param firstInput
     * @param secondInput
     * @param thirdInput
 */
    
    public <E extends Comparable> void findMax(E firstInput, E secondInput, E thirdInput) {
        E max = firstInput;
        if (secondInput.compareTo(max) > 0) {
            max = secondInput;
        }
        if (thirdInput.compareTo(max) > 0) {
            max = thirdInput;
        }
        printMax(max);

    }

    private <E> void printMax(E max) {
        System.out.println("Maximum String Fruit is :  " + max);
    }

    /**
     * This is the main method for passing the Integer values on find max method
     * .it is also passing double and String value 0n find max method
     *
     * @param args
     */
    public static void main(String[] args) {

        // creating class object to call find maximum method.
        FindMaximum findmaximum = new FindMaximum();
        Integer number1 = 10, number2 = 30, number3 = 20;
        findmaximum.findMax(number1, number2, number3);
        Double num1 = 3.5, num2 = 10.3, num3 = 4.5;
        findmaximum.findMax(num1, num2, num3);
        String fruits1 = "Apple", fruits2 = "Peach", fruits3 = "Banana";
        findmaximum.findMax(fruits1, fruits2, fruits3);
    }

}

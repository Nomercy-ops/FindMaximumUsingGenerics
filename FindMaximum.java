/**
 *
 * @author Rikesh Chhetri
 * Created On: 11.06.21
 *
 * Purpose: To  find maximum of Integer numbers, Strings, Double using java Generics
 *
 */
package com.bridgelabz.generics;

/**
 * Refactor-2 making one One Generic Method and finding the maximum ensuring
 * generic is extended to comparable.
 * @param <E>
 */

public class FindMaximum<E extends Comparable<E>>{
    
    E input1,input2,input3;

    //parameterized constructor of a class
    public FindMaximum(E input1, E input2, E input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }
    
    public E findMax(){
        return FindMaximum.findMax(input1,input2,input3);
    }
  
    
    public static  <E extends Comparable<E>> E findMax(E input1, E input2, E input3) {
        E max = input1;
        if (input2.compareTo(max) > 0) {
            max = input2;
        }
        if (input3.compareTo(max) > 0) {
            max = input3;
        }
       printMax(max);
        return max;
    }

  /**
    *  Method for printing all max values.
	*/
	
    public static <E> void printMax(E max) {
      System.out.println("Max Value = " + max);
    }

    /**
     * This is the main method for passing the Integer values on find max method
     * .it is also passing double and String value 0n find max method
     *
     * @param args
     */
    public static void main(String[] args) {

        // creating class object to call find maximum method.
        
        Integer number1 = 10, number2 = 30, number3 = 20;
        Double doubleNum1 = 3.5, doubleNum2 = 10.3, doubleNum3 = 4.5;
        String fruits1 = "Apple", fruits2 = "Peach", fruits3 = "Banana";
        
        new FindMaximum(number1,number2,number3).findMax();
        new FindMaximum(doubleNum1,doubleNum2,doubleNum3).findMax();
        new FindMaximum(fruits1,fruits2,fruits3).findMax();
    }

}

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
  * UC-1 to find maximum method returns maximum value.using a wrapper class Integer and comparing it with compareTo method.
  * @param number1
  * @param number2
  * @param number3
  * @return max Integer value
  */

    public void findMax(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }

        printMax(max);
    }
    
    /**
     *  method for printing max Integer value. 
     * @param max 
     */
    
    
    public void printMax(Integer max){
        System.out.println("Largest Integer Number is " + max);
    }

    /**
     * This is the main method for passing the Integer values on find max method .  
     * @param args 
     */
    
    public static void main(String[] args) {
        
        // creating class object to call find maximum method.
       FindMaximum findmaximum = new FindMaximum();
        Integer number1 = 10, number2 = 30,number3 = 20;
        findmaximum.findMax(number1, number2, number3);
       
    }

}

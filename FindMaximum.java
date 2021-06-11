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
  * UC-1 Here find maximum method returns maximum Number.using a wrapper class Integer and comparing it with compareTo method.
  * @param number1
  * @param number2
  * @param number3
  * 
  */

    public void findMaxInteger(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }

        printMaxInteger(max);
    }
    
    /**
     *  method for printing max Integer value. 
     * @param max 
     */
      
    public void printMaxInteger(Integer max){
        System.out.println("Maximum Integer Number is  : " + max);
    }
    
 /**
  * UC-2   findMaximum method returns maximum Double Number.using a wrapper class Double 
  * and comparing it with compareTo method.
  * @param number1
  * @param number2
  * @param number3
  * 
  */
    
    public void findMaximumDouble(Double number1, Double number2, Double number3) {
         Double max = number1;
       if(number2.compareTo(max)> 0){
           max = number2;
       }
       if(number3.compareTo(max)>0){
           max = number3;
       }
        printMaxDouble(max);
    }
     
    /**
     *  method for printing max Double value. 
     * @param max 
     */
     
    private void printMaxDouble(Double max) {
     System.out.println("Maximum Double Number is : " + max);
    }
     
 /**
  * UC-2   findMaximum method returns maximum String.
  * and comparing it with compareTo method to find max.
  * 
     * @param fruitA
     * @param fruitB
     * @param fruitC
  */
     
    public void findMaximumString(String fruitA, String fruitB, String fruitC) {
         String max = fruitA;
       if(fruitB.compareTo(max)> 0){
           max = fruitB;
       }
       if(fruitC.compareTo(max)>0){
           max = fruitC;
       }
        printString(max);
    }
    
    
    /**
     *  method for printing max String. 
     * @param max 
     */
    private void printString(String max) {
      System.out.println("Maximum String Fruit is :  " + max); 
    }

    /**
     * This is the main method for passing the Integer values on find max method .  
     * @param args 
     */
    
    public static void main(String[] args) {
        
        // creating class object to call find maximum method.
        FindMaximum findmaximum = new FindMaximum();
        Integer number1 = 10, number2 = 30,number3 = 20;
        findmaximum.findMaxInteger(number1, number2, number3);
        Double num1 = 3.5,num2 = 10.3, num3 = 4.5;
        findmaximum.findMaximumDouble(num1, num2, num3);
        String fruits1 = "Apple", fruits2 = "Peach", fruits3 = "Banana";
        findmaximum.findMaximumString(fruits1, fruits2, fruits3);
    }

}

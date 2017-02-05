package com.ex1;

/**
 * Created by chugunkova_a on 05/02/2017.
 */
public class Main {
    public static void main(String[] args) {

    }
    /* Write the signature of a function called isPrime(). The access modifier should be public,
    the return type should be boolean, and it should take a single integer parameter.*/

    public static boolean isPrime(int a){
        return true;
    }

   /* Write a Java function called absoluteValue(). The access modifier should be public, it
    should have a return type of double, and it should take one double parameter as input. If
    the double parameter is less than 0, it should return that number negated. Otherwise, it
    should return the parameter unchanged.*/

    public static double absoluteValue(double ab){
        if (ab<0){
            return -ab;
        } else {
            return ab;
        }
    }

   /* Write a Java function named calculateTip(). The access modifier should be public,
    it should have a return type of double, and it should take as input a double parameter
    representing the cost of a meal at a restaurant. And finally, it should return a double equal
    to 15% of the cost parameter*/

    public static double calculateTip(double costOfMeal){
        double total = costOfMeal*0.15;
        return total;
    }

    /*Write a Java function called nametagText(). The access modifier should be public, the
    return type should be String, and it should take a String parameter called name. In the
    body of the function, return the String “Hello, my name is ” with the name parameter added
    to the end. (Hint: use String concatenation.)*/

}

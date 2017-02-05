/**
 * Created by chugunkova_a on 02/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Java rocks!");
        int passangers;
        passangers=0;
        passangers = passangers +4;
        passangers = passangers + 4 - 3;
        System.out.println(passangers);
        int i = 5/2;
        double o = 5/2.0;
        int k = (int) o; //casting
        System.out.println(i+ " " + o + " " + k);
        System.out.println("----------------");
        /* Define an integer variable called bankBalance. Initialize it to a value of 500. Then add 250
            to it. Then subtract 100 from it. Finally, print the resulting value.*/
        int bankBalance = 500;
        bankBalance+=250;
        bankBalance-=100;
        System.out.println("Bank balance is 650, am I right? " + bankBalance);
        System.out.println("-----------------");
        /*  Write Java code to define an integer variable called day, and a String variable called month.
            Give month and day appropriate values for your birthday.*/
        int day=13;
        String months = "April";

        System.out.println("----------------");
        /*Question 6
        Write Java code to create a String variable called firstName, define it to be your first name
        as a String. Then define a variable called lastName and define it to be your last name as a
        String. Then define a variable called fullName and set it to be your first name followed by
        a space followed by your last name. Use the existing variables for your first and last name
        and String concatenation to define fullName. Finally, write code to print this text:
        Hello, my name is [full name].
        There are [number] letters in my name.
        Use String concatenation to create the first String to print using the fullName variable, and
        use the .length() command on firstName and lastName to calculate the number of letters.
        Note: you can concatenate an integer and a String and the integer will be converted to a
        String. For example, this expression:
        "There are "+ 7 + "days in a week."
        will be evaluated as the String:
        "There are 7 days in a week."*/
        String firstName = "Anna";
        String lastName = "Chugunkova";
        String fullName =  firstName + " " + lastName;
        System.out.println("Hello, my name is" + " " + fullName + ".\n" + "There are " + firstName.length() + " letters in my name.\n" );
        System.out.println("--------");
        boolean cold = true;
        if(cold){
            System.out.println("i can't help it");
        }
        System.out.println("--------");
        /*Write Java code to define a double variable called fahrenheit and set it to an initial value
        between 0 and 100. Then, create a double variable called celsius, and calculate its value
        based on the value of fahrenheit. (To convert from Fahrenheit to Celsius, subtract 32,
        then multiply by 5, then divide by 9.) Finally, print the final value of celsius*/
        double fahrenheit = 10.0;
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("TEmperature is: " +celsius);
        System.out.println("------------");
        int code = 766;
        String coffeType;

        switch (code){
            case 321: coffeType = "Espresso";
                break;
            case 766: coffeType = "Latte";
                break;
            default:coffeType="Black coffee";
                break;
        }
        System.out.println(coffeType);
        System.out.println("----------");
        /*You are programming the behavior of an enemy in a video game. The enemy code has access
        to two boolean variables, canSeePlayer and playerPoweredUp. canSeePlayer is true
        when the enemy can see the player and false otherwise, and playerPoweredUp is true when
        the player has found a special item that makes them impossible to defeat temporarily. Fill
        in the correct conditions so that “Attack!” is printed when the enemy can see the player
        and the player is not powered-up, “Run away!” is printed when the player is visible and is
        powered-up, and finally, “Wander.” is printed if the player is not visible.*/
        boolean canSeePlayer=true;
        boolean playerPoweredUp=true;
        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }
        System.out.println("----------");
        //Assume these can have any value:
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        //TODO: print "Let’s stay home." if its raining, snowing or
        //below 50 degrees and print "Let’s go out!" otherwise.
        if(!isSnowing || isRaining || temperature<50){
            System.out.println("Let's stay home");
        } else{
            System.out.println("Let's go out");
        }
        System.out.println("-------");
        /*Assume you have access to a double variable called time. Write code that assigns a different
            value to the String variable timeOfDay based on the value of time in hours. If time is
            between 5 and 12, including 5 but not including 12, set timeOfDay to “morning”. If time is
            between 12 and 20, including 12 but not including 20, set timeOfDay to “daytime”. Finally,
            if the time variable does not satisfy either condition, set timeOfDay to “night”.*/
        double time=12;
        String timeOfDay;
        if(time>=5&&time<12){
            timeOfDay = "Morning";
            System.out.println(timeOfDay);
        } else if (time>=12&&time<20){
            timeOfDay="daytime";
            System.out.println(timeOfDay);
        } else{
            timeOfDay="night";
            System.out.println(timeOfDay);
        }
    }
}

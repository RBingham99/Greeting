package com.sparta.rb;

public class App { //class
    public static void main( String[] args ) { //Method not function
        // strongly typed (must be given a type) and statically typed (type won't change)
        //primitive - int (-32768 to 32768), boolean, double (holds bigger numbers and numbers with decimal points), byte (-128 to 127), char 8 all together
        // all have object versions with capital letters like Integer

        //int timeOfDay = 21; //variable
        System.out.println(getGreeting(21));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting;
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}

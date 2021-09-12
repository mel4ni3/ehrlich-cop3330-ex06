/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021  Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main( String[] args ) {
        int age, retire, yearsleft, now, retiredate;
        Scanner s = new Scanner(System.in);
        System.out.print("What is your current age? ");
        age = s.nextInt();

        System.out.print("At what age would you like to retire? ");
        retire = s.nextInt();

        if (retire < age) {
            System.out.println("The retirement age entered is not valid, please try again.");
            retire = s.nextInt();
        }

        yearsleft = retire - age;
        System.out.println("You have " + yearsleft + " years left until you can retire.");
        now = Calendar.getInstance().get(Calendar.YEAR);
        retiredate = now + yearsleft;
        System.out.print("It's " + now + ", so you can retire in " + retiredate + ".");
    }
}
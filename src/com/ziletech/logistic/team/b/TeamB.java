package com.ziletech.logistic.team.b;

import java.util.Scanner;

/**
 *
 * @author Sunil
 */
public class TeamB {

    public static void main(String args[]) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of entered string is: " + reverse);
        System.out.println("done");
    }
}

package com.ziletech.logistic.team.a;

import java.util.Scanner;

/**
 *
 * @author Yukti
 */
public class TeamA {

    public static void main(String args[]) {
        
        RecordTeam recordTeam = new RecordTeam();
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse...!!!!!");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of entered string is: " + reverse);
        recordTeam.setTeamName("Ashwini");
        System.out.println(recordTeam.getTeamName());
        
        
    }      
}

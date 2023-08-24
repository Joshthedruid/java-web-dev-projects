package org.launchcode;

import java.util.Scanner;

public class AliceSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        alice = alice.toLowerCase();
        System.out.println("What word would you like to remove?:");
        String check = input.nextLine();
        check = check.toLowerCase();
        boolean checkPassed = alice.contains(check);
        if(!checkPassed) {
            System.out.println("That word isn't in the sentence.");
        } else {
            int checkLoc = alice.indexOf(check);
            int checkLen = check.length();
            System.out.println(check + " is " + checkLoc + " characters into the sentence and is " + checkLen + "character long.");
            alice = alice.substring(0,checkLoc) + alice.substring(checkLoc + checkLen, alice.length());
            System.out.println(alice);
        }
    }
}

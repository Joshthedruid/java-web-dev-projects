package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        int rect1 = input.nextInt();
        System.out.println("How many gallons of gas:");
        int rect2 = input.nextInt();
        rect1 /= rect2;
        System.out.println("Your MPG is " + rect1);
    }

}

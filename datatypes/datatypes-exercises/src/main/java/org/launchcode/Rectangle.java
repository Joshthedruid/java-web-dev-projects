package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give the length for a rectangle:");
        int rect1 = input.nextInt();
        System.out.println("And the length:");
        int rect2 = input.nextInt();
        rect2 *= rect1;
        System.out.println("Rectange has an area of " + rect2);
    }
}

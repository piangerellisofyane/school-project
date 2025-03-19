
package com.example;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt((10 - 5) + 1) + 5;
        System.out.println("The randomly generated number is: " + randomNumber);
    }
}
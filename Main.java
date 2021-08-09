package com.sksoft;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int i = 1; i <= 100; i++) {
            int test;
            int restOfMod3 = i % 3;
            int restOfMod5 = i % 5;
            if (restOfMod3 == 0) {
                test = 0;
            } else if (restOfMod5 == 0) {
                test = 1;
            } else {
                test = 3;
            }
            switch (test) {
                case 0:
                    System.out.print(" Fizz(" + i + "),");
                    break;
                case 1:
                    System.out.print(" Buzz(" + i + "),");
                    break;
                default:
                    System.out.print(" " + i + ",");
            }
        }
    }
}

package com.zayd.fizzbuzz;

public class Fizzbuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(convert(String.valueOf(i)));
        }
    }

    public static String convert(String input) {
        if (Integer.parseInt(input) % 15 == 0) {
            return "FizzBuzz";
        }
        if (Integer.parseInt(input) % 5 == 0) {
            return "Buzz";
        } else if (Integer.parseInt(input) % 3 == 0) {
            return "Fizz";
        } else {
            return input;
        }
    }

}
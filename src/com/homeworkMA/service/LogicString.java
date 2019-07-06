package com.homeworkMA.service;

public class LogicString {
    public static void reverseString(String result){

        // reverse string
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverseStr = stringBuilder.reverse().toString();

        System.out.println("Your revers string: " + reverseStr);

    }
}

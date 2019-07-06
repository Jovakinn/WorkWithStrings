package com.homeworkMA;

import java.util.Scanner;

import static com.homeworkMA.service.LogicString.reverseString;

public class ApplicationRunner {
    public static void main(String[] args) {
        // scanner
        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);

        // calling reverse method
        reverseString(scanner.nextLine());
    }
}

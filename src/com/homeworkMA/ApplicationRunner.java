package com.homeworkMA;

import com.homeworkMA.service.LogicString;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        // scanner
        System.out.println("Enter your string: ");
        Scanner scanner = new Scanner(System.in);

        // calling reverse method
        LogicString logicString = new LogicString();
        logicString.reverseString(scanner.nextLine());
    }
}

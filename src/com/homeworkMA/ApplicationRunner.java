package com.homeworkMA;

import com.homeworkMA.service.LogicString;
import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        logger.info("Enter your string: ");

        // scanner
        Scanner scanner = new Scanner(System.in);
        LogicString logicString = new LogicString();

        String string = scanner.nextLine();
        // calling reverse method

        logicString.isNumeric(string);
    }
}

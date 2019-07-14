package com.homeworkMA.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class LogicString {

        private static Logger logger = Logger.getLogger(LogicString.class.getName());

        public static void isNumeric(String  string) {
            ArrayList<Character> letters = new ArrayList<>();
            ArrayList<Character> numbers = new ArrayList<>();

            for (char ch : string.toCharArray()) {
                if (!Character.isDigit(ch)){

                    letters.add(Character.valueOf(ch));

                }
                else {

                    numbers.add(Character.valueOf(ch));

                }
            }
            Collections.reverse(letters);
            numbers.addAll(letters);
            logger.info(String.valueOf(numbers));

        }
}

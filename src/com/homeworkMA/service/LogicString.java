package com.homeworkMA.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class LogicString {

        private static Logger logger = Logger.getLogger(LogicString.class.getName());

        public static void isNumeric(String  string) {
            StringBuilder stringBuilder = new StringBuilder(string);
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
            letters.addAll(numbers);
            logger.info(String.valueOf(letters));

        }
}

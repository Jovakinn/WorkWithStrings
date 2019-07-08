package com.homeworkMA.service;

import java.util.ArrayList;

public class LogicString {
        public static void isNumeric(String  s) {
            StringBuilder sb = new StringBuilder(s);
            String reverseStr;

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)){
                    System.out.println(c);
                }
                else {
                    reverseStr = sb.reverse().toString();
                    System.out.println(reverseStr);
                }
            }
        }
}

package com.example.raghunat.ineedsum1;

/**
 * Created by raghunat on 9/19/2016.
 */
public class CalcController {
    public static String _equation = "";

    public static String[] operations = { "+", "-", "/", "*"};

    public static void insert(String input) {
        _equation += input;
    }

    public static double calculate() {
        Integer first = null;
        Integer second = null;
        String sign = null;
        for (int i = 0; i < _equation.length(); i ++) {
            char currentCharacter = _equation.charAt(i);
            if (currentCharacter != '+' &&
                    currentCharacter != '-' &&
                    currentCharacter != '/' &&
                    currentCharacter != '*') {
                if(first == null) {
                    first = Integer.parseInt(Character.toString(currentCharacter));
                } else {
                    second = Integer.parseInt(Character.toString(currentCharacter));
                }
            } else {
                sign = Character.toString(currentCharacter);
            }
        }

        // Apply the math
        double answer = 0;
        switch(sign) {
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
        }

        return answer;
    }
}

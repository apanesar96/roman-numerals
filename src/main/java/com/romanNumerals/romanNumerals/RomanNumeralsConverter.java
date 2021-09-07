package com.romanNumerals.romanNumerals;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TreeMap;

@SpringBootApplication
public class RomanNumeralsConverter {

    private final TreeMap<Integer, String> specialCaseNumerals = new TreeMap<>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    public String convert(int amount) {
        String numeralFound = specialCaseNumerals.get(amount);
        if (numeralFound != null) return numeralFound;

        StringBuilder numeral = new StringBuilder();
        while (amount != 0) {
            Integer nearestAmount = specialCaseNumerals.floorKey(amount);
            numeral.append(specialCaseNumerals.get(nearestAmount));
            amount -= nearestAmount;
        }

        return numeral.toString();
    }

}
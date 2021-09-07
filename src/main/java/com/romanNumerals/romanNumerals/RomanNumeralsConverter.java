package com.romanNumerals.romanNumerals;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
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
		put(100, "C");
		put(500, "D");
		put(1000, "M");

	}};

	public String convert(int amount) {

		String numeralFound = specialCaseNumerals.get(amount);

		if(numeralFound != null) return numeralFound;
		String numeral = "";
		while (amount != 0) {
			Integer nearestAmount = specialCaseNumerals.floorKey(amount);
			numeral += specialCaseNumerals.get(nearestAmount);
			amount -= nearestAmount;
		}
/*		if (amount > 5) {
			numeral += specialCaseNumerals.get(amount -1);
			numeral += specialCaseNumerals.get(1);
		} else {
			for(int i = 1; i <= amount; i++) {
				numeral += specialCaseNumerals.get(1);
			}
		}*/

		return numeral;
	}

}


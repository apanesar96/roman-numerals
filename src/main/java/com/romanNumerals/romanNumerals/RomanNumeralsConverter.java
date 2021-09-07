package com.romanNumerals.romanNumerals;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class RomanNumeralsConverter {

	private final HashMap<Integer, String> specialCaseNumerals = new HashMap<>() {{
		put(1, "I");
		put(5, "V");
		put(10, "X");
		put(50, "L");
		put(100, "C");
		put(500, "D");
		put(1000, "M");

	}};

	public String convert(int amount) {

		String numeralFound = specialCaseNumerals.get(amount);

		if(numeralFound != null) return numeralFound;
		String numeral = "";
		for(int i = 1; i <= amount; i++) {
			numeral += specialCaseNumerals.get(1);
		}

		return numeral;
	}

}


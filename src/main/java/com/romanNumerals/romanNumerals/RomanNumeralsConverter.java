package com.romanNumerals.romanNumerals;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class RomanNumeralsConverter {

	private final HashMap<Integer, String> numerals = new HashMap<>() {{
		put(1, "I");
		put(5, "V");
		put(10, "X");
	}};

	public String convert(int amount) {
		return numerals.get(amount);
	}

}


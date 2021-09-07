package com.romanNumerals.romanNumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanNumeralsConverterShould {

	private RomanNumeralsConverter target;

	@BeforeEach
	void setUp() {
		target = new RomanNumeralsConverter();
	}

	@ParameterizedTest
	@CsvSource({
			"1,I",
			"2,II",
			"3,III",
			"4,IV",
			"5,V",
			"10,X",
			"50,L",
			"100,C",
			"500,D",
			"1000,M"
	})
	void convert_arabic_numbers_to_roman_numerals(int amount, String numeral) {
		assertEquals(target.convert(amount), numeral);
	}

}

package com.romanNumerals.romanNumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanNumeralsConverterShould {

	private RomanNumeralsConverter target;

	@BeforeEach
	void setUp() {
		target = new RomanNumeralsConverter();
	}

	@Test
	void convert_one_to_numeral_I() {
		assertEquals(target.convert(1), "I");
	}

	@Test
	void convert_five_to_numeral_V() {
		assertEquals(target.convert(5), "V");
	}

	@Test
	void convert_ten_to_numeral_X() {
		assertEquals(target.convert(10), "X");
	}
}

package com.therussiankid92.javaAppExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class numberToRomanConverterTests {

	@ParameterizedTest(name = "Covert numbers from 1 to 9 : {0} = {1}")
	@CsvSource({
			"1,  I",
			"2,  II",
			"3,  III",
			"4,  IV",
			"5,  V",
			"6,  VI",
			"7,  VII",
			"8,  VIII",
			"9,  IX",
	})
	void convertAllUnits(int number, String romanNumber ){
		convert(number,romanNumber);
	}

	@ParameterizedTest(name = "Covert tens of numbers from 10 to 90 : {0} = {1}")
	@CsvSource({
			"10,  X",
			"20,  XX",
			"30,  XXX",
			"40,  XL",
			"50,  L",
			"60,  LX",
			"70,  LXX",
			"80,  LXXX",
			"90,  XC",
	})
	void convertAllFullTens(int number, String romanNumber ){
		convert(number,romanNumber);
	}

	@Test
	@DisplayName("Convert Number with Both Tens and Units: 21 = XXI")
	void convertNumberWithBothTensAndUnits(){
		convert(21, "XXI");
	}

	@ParameterizedTest(name = "Covert hundreds from 100 to 900 : {0} = {1}")
	@CsvSource({
			"100,  C",
			"200,  CC",
			"300,  CCC",
			"400,  CD",
			"500,  D",
			"600,  DC",
			"700,  DCC",
			"800,  DCCC",
			"900,  CM",
	})
	void convertAllFullHundreds(int number, String romanNumber ){
		convert(number,romanNumber);
	}

	@Test
	@DisplayName("Convert Number with Hundreds, Tens and Units: 457 = CDLVII")
	void convertNumberWithHundredsTensAndUnits(){
		convert(457, "CDLVII");
	}

	@Test
	@DisplayName("Convert Number with Hundreds, Tens and no Units: 450 = CDL")
	void convertNumberWithHundredsTensAndNoUnits(){
		convert(450, "CDL");
	}

	@Test
	@DisplayName("Convert Number with Hundreds, no Tens and Units: 405 = CDV")
	void convertNumberWithHundredsWithoutTensAndWithUnits(){
		convert(405, "CDV");
	}

	@ParameterizedTest(name = "Covert thousands from 1000 to 3000 : {0} = {1}")
	@CsvSource({
			"1000,  M",
			"2000,  MM",
			"3000,  MMM",
	})
	void convertAllFullThousands(int number, String romanNumber ){
		convert(number,romanNumber);
	}

	@Test
	@DisplayName("Convert Number with Thousands, Hundreds, Tens and Units: 3999 = MMMCMXCIX")
	void convertNumberWithThousandsHundredsTensAndWithUnits(){
		convert(3999, "MMMCMXCIX");
	}

	@Test
	@DisplayName("Convert Number with Thousands, without Hundreds, with Tens and Units: 3099 = MMMXCIX")
	void convertNumberWithThousandsWithoutHundredsWithTensAndWithUnits(){
		convert(3099, "MMMXCIX");
	}

	@Test
	@DisplayName("Convert 0 = nulla")
	void convertZero(){
		convert(0, "nulla");
	}

	@Test
	@DisplayName("Convert -1 : No representation of negative roman numbers exist")
	void convertNegative(){
		convert(-1, "No representation of negative roman numbers exist");
	}

	@Test
	@DisplayName("Convert 4000:  No representation of roman numbers bigger than 3999 exists")
	void convertBiggerThan3999(){
		convert(4000, "No representation of roman numbers bigger than 3999 exists");
	}

	void convert(int number, String response ){
		NumberToRomanConverter converter = new NumberToRomanConverter();
		assertEquals(response, converter.convert(number),
				() -> number + " should equal " + response);
	}
}

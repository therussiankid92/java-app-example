package com.therussiankid92.javaAppExample;

public class NumberToRomanConverter {

	public static String convert(int number) {
		String response = "";
		if (isNumberConvertable(number) == true) {
			String romanNumber = "";
			String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
			String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
			String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
			String[] thousands = {"", "M", "MM", "MMM"};

			int unitSelector = number % 10;
			int tensSelector = (number / 10) % 10;
			int hundredsSelector = (number / 100) % 10;
			int thousandsSelector = (number / 1000) % 10;


			romanNumber = thousands[thousandsSelector] + hundreds[hundredsSelector] + tens[tensSelector] + units[unitSelector];
			response = romanNumber;
		} else {
			response = respondWhenNumberNotConvertable(number);
		}
		return response;
	}

	private static boolean isNumberConvertable(int number) {
		if (number > 0 && number < 4000) {
			return true;
		} else {
			return false;
	}
}

	private static String respondWhenNumberNotConvertable(int number){
		String response = "";
		String zeroResponse = "nulla";
		String numberNegativeResponse = "No representation of negative roman numbers exist";
		String numberBiggerThan3999Response = "No representation of roman numbers bigger than 3999 exists";
		if (number == 0)
		{
			response = zeroResponse;
		}
		else if(number <0) {
			response = numberNegativeResponse;
		}
		else if (number>3999) {
			response = numberBiggerThan3999Response;
		}
		return response;
	}
}

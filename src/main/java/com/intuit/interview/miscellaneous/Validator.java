package com.intuit.interview.miscellaneous;

import java.util.regex.Pattern;

/**
 * @author Vageesh Hegde
 */
public class Validator
{
	public static boolean validateRegistrationNumber(String registrationNumber)
	{
		return Pattern.matches("^[A-Z]{2}-[0-9]{2}-[A-Z]{2}-[0-9]{4}$",
				registrationNumber);
	}
}

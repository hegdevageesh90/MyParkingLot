package com.intuit.interview.miscellaneous;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatorTest
{
	@Test
	public void testValidateRegistrationNumber()
	{
		assertFalse(Validator.validateRegistrationNumber("Registration Number"));
	}

	@Test
	public void testValidateRegistrationNumberOK()
	{
		assertTrue(Validator.validateRegistrationNumber("AB-11-CD-2222"));
	}
}


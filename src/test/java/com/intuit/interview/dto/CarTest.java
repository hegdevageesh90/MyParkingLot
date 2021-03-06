package com.intuit.interview.dto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest
{
	@Test
	public void testSetColor()
	{
		Car car = new Car();
		car.setColor("Color");
		assertEquals("Color", car.getColor());
	}

	@Test
	public void testSetRegistrationNumber()
	{
		Car car = new Car();
		car.setRegistrationNumber("Registration Number");
		assertEquals("Registration Number", car.getRegistrationNumber());
	}

	@Test
	public void testToString()
	{
		assertEquals("Car(registrationNumber=null, color=null)",
				(new Car()).toString());
	}
}


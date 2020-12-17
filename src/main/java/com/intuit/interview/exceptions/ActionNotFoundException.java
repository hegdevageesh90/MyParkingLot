package com.intuit.interview.exceptions;

/**
 * @author Vageesh Hegde
 */
public class ActionNotFoundException extends Exception
{
	public ActionNotFoundException(final String errorMessage)
	{
		super(errorMessage);
	}

	public ActionNotFoundException(final String errorMsg,
			final Throwable errorObject)
	{
		super(errorMsg, errorObject);
	}
}

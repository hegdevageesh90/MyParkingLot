package com.intuit.interview.exceptions;

/**
 * @author Vageesh Hegde
 */
public class ServiceException extends Exception
{
	public ServiceException(final String errorMessage)
	{
		super(errorMessage);
	}

	public ServiceException(final String errorMsg, final Throwable errorObject)
	{
		super(errorMsg, errorObject);
	}
}

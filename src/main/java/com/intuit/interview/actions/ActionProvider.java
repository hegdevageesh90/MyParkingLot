package com.intuit.interview.actions;

import com.intuit.interview.exceptions.ServiceException;

/**
 * @author Vageesh Hegde
 */
public abstract class ActionProvider
{
	public abstract void runAction(String[] splitCommand);
}

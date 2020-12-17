package com.intuit.interview.parser;

import com.intuit.interview.actions.ActionFactory;
import com.intuit.interview.actions.ActionProvider;
import com.intuit.interview.exceptions.ActionNotFoundException;
import com.intuit.interview.exceptions.ServiceException;

import java.util.Scanner;

/**
 * @author Vageesh Hegde
 */
public class CommandLineBasedActionParser
{
	public CommandLineBasedActionParser()
			throws ActionNotFoundException
	{
		Scanner scanner = new Scanner(System.in);
		ActionFactory actionFactory = new ActionFactory();
		while (true) {
			System.out.println("Input: ");
			String command = scanner.nextLine();
			final ActionProvider action = actionFactory.getAction(command);
			String[] splitCommand = command.split("\\s+");
			System.out.println("Output: ");
			action.runAction(splitCommand);
			System.out.println();
		}
	}
}

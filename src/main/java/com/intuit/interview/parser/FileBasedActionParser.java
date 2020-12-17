package com.intuit.interview.parser;

import com.intuit.interview.actions.ActionFactory;
import com.intuit.interview.actions.ActionProvider;
import com.intuit.interview.exceptions.ActionNotFoundException;
import com.intuit.interview.exceptions.ServiceException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Vageesh Hegde
 */
public class FileBasedActionParser
{
	private BufferedReader bufferedReader;

	public FileBasedActionParser(String path)
			throws ActionNotFoundException, ServiceException
	{
		ActionFactory actionFactory = new ActionFactory();
		try {
			bufferedReader = new BufferedReader(new FileReader(path));
			String command;
			while ((command = bufferedReader.readLine()) != null) {
				System.out.println("Input:");
				System.out.println(command);
				System.out.println();
				final ActionProvider provider = actionFactory
						.getAction(command);
				String[] splitCommand = command.split("\\s+");
				System.out.println("Output:");
				provider.runAction(splitCommand);
				System.out.println();
			}
		} catch (IOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

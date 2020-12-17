package com.intuit.interview;

import com.intuit.interview.exceptions.ActionNotFoundException;
import com.intuit.interview.exceptions.ServiceException;
import com.intuit.interview.parser.CommandLineBasedActionParser;
import com.intuit.interview.parser.FileBasedActionParser;

import java.util.Scanner;

/**
 * @author Vageesh Hegde
 */
public class ParkingLotApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Action Modes : Command Line Based (c) / File Based (f)");
		String choice = scanner.nextLine();
		try {
			if (choice.equalsIgnoreCase("c")) {
				new CommandLineBasedActionParser();
			} else if (choice.equalsIgnoreCase("f")) {
				System.out.println("Provide file path");
				String path = scanner.nextLine();
				new FileBasedActionParser(path);
			}
		} catch (ActionNotFoundException | ServiceException e) {
			System.out.println("There was an exception : " + e.getMessage());
			e.printStackTrace();
		}
	}
}

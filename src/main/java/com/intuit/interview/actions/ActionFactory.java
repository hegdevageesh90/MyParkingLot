package com.intuit.interview.actions;

import com.intuit.interview.exceptions.ActionNotFoundException;

import static com.intuit.interview.miscellaneous.Constants.*;

/**
 * @author Vageesh Hegde
 */
public class ActionFactory
{
	public ActionProvider getAction(String rawAction)
			throws ActionNotFoundException
	{
		String actionPrefix = (rawAction.contains(KEY_SINGLE_SPACE)) ?
				rawAction.substring(0, rawAction.indexOf(KEY_SINGLE_SPACE)) :
				rawAction;

		switch (actionPrefix) {
		case ACTION_CREATE_PARKING_LOT:
			return new CreateParkingLot();
		case ACTION_PARK:
			return new ParkACar();
		case ACTION_LEAVE:
			return new ExitACar();
		case ACTION_STATUS:
			return new Status();
		case ACTION_FREE_SLOTS:
			return new FreeSlots();
		case ACTION_REGISTRATION_NUMBERS_WITH_COLOR:
			return new NumbersWithColor();
		case ACTION_SLOT_WITH_COLOR:
			return new SlotsWithColor();
		case ACTION_SLOT_WITH_NUMBER:
			return new SlotWithNumber();
		default:
			System.out.println(INVALID_COMMAND);
			throw new ActionNotFoundException(INVALID_COMMAND);
		}
	}
}

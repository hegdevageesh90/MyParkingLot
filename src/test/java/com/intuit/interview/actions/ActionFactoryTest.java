package com.intuit.interview.actions;

import com.intuit.interview.exceptions.ActionNotFoundException;
import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ActionFactoryTest
{
	@Test
	public void testGetAction() throws ActionNotFoundException
	{
		assertThrows(ActionNotFoundException.class,
				() -> (new ActionFactory()).getAction("Raw Action"));
		assertTrue((new ActionFactory())
				.getAction("create") instanceof CreateParkingLot);
		assertTrue(
				(new ActionFactory()).getAction("leave") instanceof ExitACar);
		assertTrue((new ActionFactory()).getAction("park") instanceof ParkACar);
		assertTrue((new ActionFactory())
				.getAction("register_with_colour") instanceof NumbersWithColor);
		assertTrue((new ActionFactory())
				.getAction("slot_check") instanceof FreeSlots);
		assertTrue((new ActionFactory())
				.getAction("slot_check_with_color") instanceof SlotsWithColor);
		assertTrue((new ActionFactory())
				.getAction("slot_check_with_number") instanceof SlotWithNumber);
		assertTrue((new ActionFactory()).getAction("status") instanceof Status);
	}
}


package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.exceptions.ServiceException;

/**
 * @author Vageesh Hegde
 */
public class FreeSlots extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand)
	{
		try {
			System.out.println(
					ParkingLotDataStructure.getRemainingSpots().size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

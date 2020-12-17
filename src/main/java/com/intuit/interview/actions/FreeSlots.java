package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.exceptions.ServiceException;

/**
 * @author Vageesh Hegde
 */
public class FreeSlots extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand) throws ServiceException
	{
		try {
			System.out.println(
					ParkingLotDataStructure.getRemainingSpots().size());
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

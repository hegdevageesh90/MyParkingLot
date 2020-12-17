package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vageesh Hegde
 */
public class CreateParkingLot extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand)
	{
		try {
			int inputParkingLotSize = Integer.parseInt(splitCommand[1]);
			Integer entryPoints = Integer.parseInt(splitCommand[2]);
			List<Integer> spots = new ArrayList<>();
			for (int i = 1; i <= inputParkingLotSize; i++) {
				spots.add(i);
			}
			ParkingLotDataStructure.setTotalAllowedSpots(inputParkingLotSize);
			ParkingLotDataStructure.setRemainingSpots(spots);
			ParkingLotDataStructure.setEntryPoints(entryPoints);
			System.out.println(
					"Created a parking lot with " + inputParkingLotSize
							+ " slots and " + entryPoints + " entry points");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

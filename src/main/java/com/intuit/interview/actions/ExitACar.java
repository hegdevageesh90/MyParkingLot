package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;

import java.util.Collections;
import java.util.List;

import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class ExitACar extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand)
	{
		try {
			if (!ParkingLotDataStructure.getParkingLot().isEmpty()
					|| ParkingLotDataStructure.getRemainingSpots() != null) {
				Integer parkingLotSpaceNumber = Integer
						.parseInt(splitCommand[1]);
				ParkingLotDataStructure.getParkingLot()
						.remove(parkingLotSpaceNumber);
				System.out.println(
						"slot number " + parkingLotSpaceNumber + " is free");
				List<Integer> placesLeft = ParkingLotDataStructure
						.getRemainingSpots();
				placesLeft.add(parkingLotSpaceNumber);
				Collections.sort(placesLeft);
				ParkingLotDataStructure.setRemainingSpots(placesLeft);
			} else {
				System.out.println(PARKING_LOT_NOT_CREATED);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

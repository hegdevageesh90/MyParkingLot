package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;
import com.intuit.interview.exceptions.ServiceException;

import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class Status extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand)
	{
		try {
			if (!ParkingLotDataStructure.getRemainingSpots().isEmpty()
					|| ParkingLotDataStructure.getRemainingSpots() != null) {
				System.out.println("Slot No.\tRegistration No.\tColor");
				Car car;
				for (int i = 1;
					 i <= ParkingLotDataStructure.getParkingLot().size(); i++) {
					if (ParkingLotDataStructure.getParkingLot()
							.containsKey(i)) {
						car = ParkingLotDataStructure.getParkingLot().get(i);
						System.out.println(
								i + "\t" + car.getRegistrationNumber() + "\t"
										+ car.getColor());
					}
				}
			} else {
				System.out.println(PARKING_LOT_NOT_CREATED);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

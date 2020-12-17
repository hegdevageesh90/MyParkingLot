package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;
import com.intuit.interview.exceptions.ServiceException;

/**
 * @author Vageesh Hegde
 */
public class Status extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand) throws ServiceException
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
				throw new ServiceException(
						"Parking Lot Not Found. Create one first");
			}

		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;
import com.intuit.interview.exceptions.ServiceException;
import com.intuit.interview.miscellaneous.Validator;

import java.util.List;

import static com.intuit.interview.miscellaneous.Constants.INVALID_REGISTRATION_NUMBER;
import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class ParkACar extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand) throws ServiceException
	{
		try {
			if (!ParkingLotDataStructure.getRemainingSpots().isEmpty()
					|| ParkingLotDataStructure.getRemainingSpots() != null) {

				if (!Validator.validateRegistrationNumber(splitCommand[1])) {
					throw new ServiceException(INVALID_REGISTRATION_NUMBER);
				}

				Car car = new Car(splitCommand[1], splitCommand[2]);
				List<Integer> totalPlacesLeft = ParkingLotDataStructure
						.getRemainingSpots();
				if (totalPlacesLeft.isEmpty()) {
					System.out.println("sorry, parking lot is full");
				} else {
					Integer parkingSlot = totalPlacesLeft.get(0);
					if (totalPlacesLeft.size() <= ParkingLotDataStructure
							.getTotalAllowedSpots()) {
						ParkingLotDataStructure.getParkingLot()
								.put(parkingSlot, car);
					}
					System.out.println("parked slot number: " + parkingSlot);
					totalPlacesLeft.remove(0);
				}
			} else {
				throw new ServiceException(PARKING_LOT_NOT_CREATED);
			}

		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

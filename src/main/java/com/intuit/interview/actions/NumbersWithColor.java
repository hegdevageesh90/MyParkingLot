package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;
import com.intuit.interview.exceptions.ServiceException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class NumbersWithColor extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand) throws ServiceException
	{
		try {
			if (!ParkingLotDataStructure.getRemainingSpots().isEmpty()
					|| ParkingLotDataStructure.getRemainingSpots() != null) {
				String colour = splitCommand[1];
				boolean flag = false;
				Collection<Car> allCars = ParkingLotDataStructure
						.getParkingLot().values();
				List<String> regList = new ArrayList<>();
				for (Car car : allCars) {
					if (car.getColor().equals(colour)) {
						flag = true;
						regList.add(car.getRegistrationNumber());
					}
				}
				if (!flag) {
					System.out.print("Not Found");
				} else {
					System.out.println(String.join(",", regList));
				}
			} else {
				throw new ServiceException(PARKING_LOT_NOT_CREATED);
			}

		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

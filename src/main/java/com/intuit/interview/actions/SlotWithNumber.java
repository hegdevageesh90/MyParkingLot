package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;
import com.intuit.interview.exceptions.ServiceException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class SlotWithNumber extends ActionProvider
{
	@Override
	public void runAction(String[] splitCommand) throws ServiceException
	{
		try {
			if (!ParkingLotDataStructure.getRemainingSpots().isEmpty()
					|| ParkingLotDataStructure.getRemainingSpots() != null) {
				boolean flag = false;
				String registrationNumber = splitCommand[1];
				Collection<Car> allCars = ParkingLotDataStructure
						.getParkingLot().values();
				List<String> slotNum = new ArrayList<>();
				for (Car car : allCars) {
					if (car.getRegistrationNumber()
							.equals(registrationNumber)) {
						for (Map.Entry<Integer, Car> entry : ParkingLotDataStructure
								.getParkingLot().entrySet()) {
							if (entry.getValue().equals(car)) {
								flag = true;
								String key = entry.getKey().toString();
								slotNum.add(key);
							}
						}
					}
				}
				if (!flag) {
					System.out.print("Not found");
				} else {
					System.out.println(String.join(",", slotNum));
				}
			} else {
				throw new ServiceException(PARKING_LOT_NOT_CREATED);
			}
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}

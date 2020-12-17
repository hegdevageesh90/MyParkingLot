package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;

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
	public void runAction(String[] splitCommand)
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
				System.out.println(PARKING_LOT_NOT_CREATED);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
	}
}

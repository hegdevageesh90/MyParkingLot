package com.intuit.interview.actions;

import com.intuit.interview.data.ParkingLotDataStructure;
import com.intuit.interview.dto.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.intuit.interview.miscellaneous.Constants.PARKING_LOT_NOT_CREATED;

/**
 * @author Vageesh Hegde
 */
public class SlotsWithColor extends ActionProvider
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
				List<String> slotNum = new ArrayList<>();
				for (Car car : allCars) {
					if (car.getColor().equals(colour)) {
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
				System.out.println(PARKING_LOT_NOT_CREATED);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

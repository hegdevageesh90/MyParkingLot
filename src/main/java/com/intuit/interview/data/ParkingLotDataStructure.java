package com.intuit.interview.data;

import com.intuit.interview.dto.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vageesh Hegde
 */
public class ParkingLotDataStructure
{
	private static List<Integer> remainingSpots;
	private static Integer totalAllowedSpots;
	private static Integer entryPoints;
	private static Map<Integer, Car> parkingLot = new HashMap<>();

	public static void setTotalAllowedSpots(Integer inTotalAllowedSpots)
	{
		totalAllowedSpots = inTotalAllowedSpots;
	}

	public static void setRemainingSpots(List<Integer> inSpots)
	{
		remainingSpots = inSpots;
	}

	public static void setEntryPoints(Integer inEntryPoints)
	{
		entryPoints = inEntryPoints;
	}

	public static Integer getTotalAllowedSpots()
	{
		return totalAllowedSpots;
	}

	public static List<Integer> getRemainingSpots()
	{
		return remainingSpots;
	}

	public static Integer getEntryPoints()
	{
		return entryPoints;
	}

	public static Map<Integer, Car> getParkingLot()
	{
		return parkingLot;
	}
}

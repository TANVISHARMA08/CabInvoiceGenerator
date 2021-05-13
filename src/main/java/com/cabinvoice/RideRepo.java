package com.cabinvoice;

import java.util.HashMap;

public class RideRepo {
	HashMap<Integer, Rides[]> ridesByUserId = new HashMap<>();

	public RideRepo() {
		Rides[] rides1 = { new Rides(2.0, 5, "normal"), new Rides(0.1, 1, "normal") };
		ridesByUserId.put(1, rides1);
		Rides[] rides2 = { new Rides(5.0, 10, "premium"), new Rides(0.1, 1, "normal") };
		ridesByUserId.put(2, rides2);
		Rides[] rides3 = { new Rides(10.0, 10, "normal"), new Rides(0.1, 1, "premium") };
		ridesByUserId.put(3, rides3);
	}

	public Rides[] getRideList(Integer userId) {
		return ridesByUserId.get(userId);
	}

}

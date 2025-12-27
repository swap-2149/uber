package project.uber.uberApp.strategies.impl;

import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.entities.RideRequest;
import project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}

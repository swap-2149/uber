package project.uber.uberApp.strategies;

import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {
    double RIDE_FARE_MULTIPLIER = 10;
    double calculateFare(RideRequest rideRequest);

}

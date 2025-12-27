package project.uber.uberApp.strategies.impl;

import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.entities.Driver;
import project.uber.uberApp.entities.RideRequest;
import project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}

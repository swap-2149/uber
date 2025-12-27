package project.uber.uberApp.services;

import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.RideDto;
import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.dto.RiderDto;
import project.uber.uberApp.entities.Rider;
import project.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
    Rider createNewRider(User user);
}

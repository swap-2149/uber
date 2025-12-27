package project.uber.uberApp.services.impl;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.RideDto;
import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.dto.RiderDto;
import project.uber.uberApp.entities.RideRequest;
import project.uber.uberApp.entities.Rider;
import project.uber.uberApp.entities.User;
import project.uber.uberApp.entities.enums.RideRequestStatus;
import project.uber.uberApp.repositories.RideRequestRepository;
import project.uber.uberApp.repositories.RiderRepository;
import project.uber.uberApp.services.RiderService;
import org.springframework.stereotype.Service;
import project.uber.uberApp.strategies.DriverMatchingStrategy;
import project.uber.uberApp.strategies.RideFareCalculationStrategy;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }
}

package project.uber.uberApp.services;

import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.SignupDto;
import project.uber.uberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}

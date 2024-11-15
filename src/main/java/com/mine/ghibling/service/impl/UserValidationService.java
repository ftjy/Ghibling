package com.mine.ghibling.service.impl;

import com.mine.ghibling.exceptions.RegistrationException;
import com.mine.ghibling.repository.UserRepository;
import com.mine.ghibling.security.dto.RegistrationRequest;
import com.mine.ghibling.utils.ExceptionMessageAccessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.mine.ghibling.service.IUserValidationService;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserValidationService implements IUserValidationService {
    private static final String EMAIL_ALREADY_EXISTS = "email_already_exists";

    private static final String USERNAME_ALREADY_EXISTS = "username_already_exists";

    private final UserRepository userRepository;

    private final ExceptionMessageAccessor exceptionMessageAccessor;

    @Override
    public void validateUser(RegistrationRequest registrationRequest) {

        final String email = registrationRequest.getEmail();
        final String username = registrationRequest.getUsername();

        checkEmail(email);
        checkUsername(username);
    }

    private void checkUsername(String username) {

        final boolean existsByUsername = userRepository.existsByUsername(username);

        if (existsByUsername) {

            log.warn("{} is already being used!", username);

            final String existsUsername = exceptionMessageAccessor.getMessage(null, USERNAME_ALREADY_EXISTS);
            throw new RegistrationException(existsUsername);
        }

    }

    private void checkEmail(String email) {

        final boolean existsByEmail = userRepository.existsByEmail(email);

        if (existsByEmail) {

            log.warn("{} is already being used!", email);

            final String existsEmail = exceptionMessageAccessor.getMessage(null, EMAIL_ALREADY_EXISTS);
            log.info(existsEmail);
            throw new RegistrationException(existsEmail);
        }
    }
}

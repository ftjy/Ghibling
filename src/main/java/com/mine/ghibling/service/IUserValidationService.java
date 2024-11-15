package com.mine.ghibling.service;

import com.mine.ghibling.security.dto.RegistrationRequest;

public interface IUserValidationService {
    void validateUser(RegistrationRequest registrationRequest);
}

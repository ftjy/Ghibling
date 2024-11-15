package com.mine.ghibling.security.service;

import com.mine.ghibling.model.User;
import com.mine.ghibling.security.dto.AuthenticatedUserDto;
import com.mine.ghibling.security.dto.RegistrationRequest;
import com.mine.ghibling.security.dto.RegistrationResponse;

public interface UserService {
    User findByUsername(String username);

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUserByUsername(String username);
}

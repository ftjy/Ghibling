package com.mine.ghibling.security.dto;

import com.mine.ghibling.model.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticatedUserDto {
    private String name;

    private String username;

    private String password;

    private UserRole userRole;
}

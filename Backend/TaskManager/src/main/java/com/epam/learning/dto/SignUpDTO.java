package com.epam.learning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {
    @NotBlank(message = "Full name cannot be blank")
    private String fullName;
    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;
    @NotBlank(message = "Password cannot be blank")
    private String password;
    @NotBlank(message = "Confirmation Password cannot be blank")
    private String confirmPassword;
}
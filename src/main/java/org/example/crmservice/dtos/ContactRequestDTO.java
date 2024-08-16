package org.example.crmservice.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ContactRequestDTO {

    @NotBlank(message = "first name can not be blank")
    @Size(max = 16, message = "first name can not be of more than 16 characters")
    private String firstName;

    @NotBlank(message = "last name can not be empty")
    @Size(max = 16, message = "last name can not be of more than 16 characters")
    private String lastName;

    @NotBlank(message = "email can not be empty")
    @Email(message = "not a valid email")
    private String email;

    @Pattern(regexp = "^[0-9][10]$", message = "phone number should be 10 digits")
    private String phone;


}

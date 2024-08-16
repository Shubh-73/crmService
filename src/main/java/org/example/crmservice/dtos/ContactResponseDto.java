package org.example.crmservice.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactResponseDto {

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;


}

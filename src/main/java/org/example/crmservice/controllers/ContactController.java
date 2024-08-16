package org.example.crmservice.controllers;


import org.example.crmservice.dtos.ContactRequestDTO;
import org.example.crmservice.dtos.ContactResponseDto;
import org.example.crmservice.models.Contact;
import org.example.crmservice.services.ContanctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tenant/{tenantId}/contacts")
public class ContactController {

    @Autowired
    private ContanctService contactService;

    @PostMapping
    public ResponseEntity<ContactResponseDto> createContact(
            @PathVariable UUID tenantId,
            @Validated @RequestBody ContactRequestDTO requestDTO) {

        Contact contact = new Contact();
        contact.setFirstName(requestDTO.getFirstName());
        contact.setLastName(requestDTO.getLastName());
        contact.setEmail(requestDTO.getEmail());
        contact.setPhone(requestDTO.getPhone());

        Contact savedContact = contactService.createContact(contact);
        ContactResponseDto contactResponseDto = mapToResponseDto(savedContact);


        return new ResponseEntity<>(contactResponseDto, HttpStatus.OK);
    }




    private ContactResponseDto mapToResponseDto(Contact contact) {
        ContactResponseDto contactResponseDto = new ContactResponseDto();
        contactResponseDto.setEmail(contact.getEmail());
        contactResponseDto.setFirstName(contact.getFirstName());
        contactResponseDto.setLastName(contact.getLastName());
        contactResponseDto.setPhone(contact.getPhone());
        return contactResponseDto;
    }
}

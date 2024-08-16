package org.example.crmservice.services;

import org.example.crmservice.models.Contact;
import org.example.crmservice.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContanctService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Optional<Contact> getContactById(UUID id){
        return contactRepository.findById(id);
    }
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    public Contact updateContact(UUID id, Contact contact) {
        if(contactRepository.existsById(id)){
            contact.setContactID(id);
            return contactRepository.save(contact);
        }
        return null;
    }

    public void deleteContact(UUID id) {
        contactRepository.deleteById(id);
    }

}

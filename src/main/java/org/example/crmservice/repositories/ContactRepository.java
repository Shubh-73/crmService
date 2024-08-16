package org.example.crmservice.repositories;

import org.example.crmservice.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContactRepository extends MongoRepository<Contact, UUID> {

    @Override
    List<Contact> findAll();

    @Override
    List<Contact> findAllById(Iterable<UUID> uuids);

    Contact findByEmail(String email);

}

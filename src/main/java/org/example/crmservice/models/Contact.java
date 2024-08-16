package org.example.crmservice.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Getter
@Setter
@Document(collection = "contacts")
public class Contact extends BaseClass {

    @Id
    private UUID contactID;
    private UUID tenantID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}

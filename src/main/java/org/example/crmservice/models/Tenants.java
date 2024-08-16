package org.example.crmservice.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Document(collection = "tenants")
public class Tenants extends BaseClass
{
    @Id
    private UUID id;
    private String name;

}

package org.example.crmservice.models;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;


@Getter
@Setter
@Document(collection = "opportunities")
public class Opportunity extends BaseClass
{
    @Id
    private UUID opportunityId;
    private UUID tenantId;
    private String title;
    private String stage;
    private BigDecimal amount;
    private Instant closeDate;
}

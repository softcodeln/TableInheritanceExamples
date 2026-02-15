package dev.lucky.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_tas")
@DiscriminatorValue(value = "TA")
public class TA extends User {
    private Integer helpRequests;
}

package dev.lucky.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_mentors")
@DiscriminatorValue(value = "Mentor")
public class Mentor extends User {
    private String company;
}

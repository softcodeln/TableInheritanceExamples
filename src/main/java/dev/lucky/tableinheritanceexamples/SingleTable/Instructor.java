package dev.lucky.tableinheritanceexamples.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "st_instructors")
@DiscriminatorValue(value = "Instructor")
public class Instructor extends User {
    private Double ratings;
}

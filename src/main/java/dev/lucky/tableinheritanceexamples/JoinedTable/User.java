package dev.lucky.tableinheritanceexamples.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;

@Entity(name = "jt_users")
// Test comment for feature branch creation.
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private String name;
    @Id
    private UUID id;
}

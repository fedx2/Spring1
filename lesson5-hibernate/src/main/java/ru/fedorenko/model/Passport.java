package ru.fedorenko.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
    private String number;
    private String serial;
    private String issuedBy;
    private Instant issuedDate;

}

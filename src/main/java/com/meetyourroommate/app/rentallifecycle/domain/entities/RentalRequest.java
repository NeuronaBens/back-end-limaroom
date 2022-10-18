package com.meetyourroommate.app.rentallifecycle.domain.entities;

import com.meetyourroommate.app.shared.valueobjects.Audit;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class RentalRequest {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private Audit audit;
}

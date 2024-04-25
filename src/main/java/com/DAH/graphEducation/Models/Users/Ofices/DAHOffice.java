package com.DAH.graphEducation.Models.Users.Ofices;

import com.DAH.graphEducation.Models.Users.DAHVenue;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DAHOffice {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    @ManyToOne
    @JoinColumn(name = "wor_id")
    private DAHVenue venue_from;

    @ManyToOne
    @JoinColumn(name = "dah_office_type_id")
    private DAHOficeType type;

    
}

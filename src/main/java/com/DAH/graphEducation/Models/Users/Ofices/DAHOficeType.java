package com.DAH.graphEducation.Models.Users.Ofices;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DAHOficeType {

        private String code;
        private String name;
        private String description;
        @ManyToOne
        @JoinColumn(name = "dah_generation_id")
        private DAHGeneration generation;
        
    
    
}

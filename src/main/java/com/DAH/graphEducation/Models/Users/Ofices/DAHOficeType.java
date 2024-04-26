package com.DAH.graphEducation.Models.Users.Ofices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;

@Entity
public class DAHOficeType {
        private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

        private String code;
        private String name;
        private String description;
        @ManyToOne
        @JoinColumn(name = "dah_generation_id")
        private DAHGeneration generation;



        public Long getId() {
                return this.id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getCode() {
                return this.code;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return this.description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public DAHGeneration getGeneration() {
                return this.generation;
        }

        public void setGeneration(DAHGeneration generation) {
                this.generation = generation;
        }

        
    
    
}

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

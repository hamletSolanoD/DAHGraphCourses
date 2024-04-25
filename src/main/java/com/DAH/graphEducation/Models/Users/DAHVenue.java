package com.DAH.graphEducation.Models.Users;

import jakarta.persistence.Entity;

@Entity
public class DAHVenue {

   private String code;
    

   public String getCode() {
      return this.code;
   }

   public void setCode(String code) {
      this.code = code;
   }

}

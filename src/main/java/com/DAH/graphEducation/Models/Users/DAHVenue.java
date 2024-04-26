package com.DAH.graphEducation.Models.Users;


import java.util.List;

import com.DAH.graphEducation.Models.Converters.VenueTypeConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
// Comunidades
@Entity
public class DAHVenue {

   public enum VenueType {
      // ennums 
      PUBLIC_GROUP("Public Group", (short) 1),
      UNIVERSITY("University", (short) 2),                           
      HIGH_SCHOOL("High School", (short) 3),
      PRIVATE_GROUP("Private Group", (short) 4),
      COMPANY("Company", (short) 5),
      OTHER("Other", (short) 6); 
  private final String type;
      private final short value;
      VenueType(String type, short value) {
         this.type = type;
         this.value = value;
      }
      @Override
      public String toString(){
        return this.type;
      }
      public short getValue(){
        return this.value;
      }
      
   }

   private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

   private String code;

   private String name;

   private Boolean approvment_required;//only if private groups

   private Boolean is_private;

   private String description;

   private String location;

   private String image;

   private String cover_image;

   
   @Column
   @Convert(converter = VenueTypeConverter.class) 
   private VenueType type;

   @ManyToMany
   @JoinTable(
      name = "users_venue",
    joinColumns = @JoinColumn(name = "venue_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id")
   )
   private List<DAHUser> users;

   @ManyToMany
   @JoinTable(
      name = "master_venue_users",
    joinColumns = @JoinColumn(name = "venue_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id")
   )
   private List<DAHUser> master_users;



    


   public Boolean isIs_private() {
      return this.is_private;
   }

   public Boolean getIs_private() {
      return this.is_private;
   }

   public void setIs_private(Boolean is_private) {
      this.is_private = is_private;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getImage() {
      return this.image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public String getCover_image() {
      return this.cover_image;
   }

   public void setCover_image(String cover_image) {
      this.cover_image = cover_image;
   }

   public VenueType getType() {
      return this.type;
   }

   public void setType(VenueType type) {
      this.type = type;
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

   public Boolean isApprovment_required() {
      return this.approvment_required;
   }

   public Boolean getApprovment_required() {
      return this.approvment_required;
   }

   public void setApprovment_required(Boolean approvment_required) {
      this.approvment_required = approvment_required;
   }

   public List<DAHUser> getUsers() {
      return this.users;
   }

   public void setUsers(List<DAHUser> users) {
      this.users = users;
   }

   public List<DAHUser> getMaster_users() {
      return this.master_users;
   }

   public void setMaster_users(List<DAHUser> master_users) {
      this.master_users = master_users;
   }



   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }


}

package com.DAH.graphEducation.Models.Users;


import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class DAHVenue {

   private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

   private String code;

   private String name;

   private Boolean approvment_required;//only if private groups

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

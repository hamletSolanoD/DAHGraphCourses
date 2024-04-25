package com.DAH.graphEducation.Models.Users;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.DAH.graphEducation.Models.DAHUniversity.DAHAcademic;
import com.DAH.graphEducation.Models.DAHUniversity.DAHMaster;
import com.DAH.graphEducation.Models.Users.Ofices.DAHOffice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class DAHUser {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private String last_name;
    private String email;
    private String password;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

     @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    @JoinTable(name = "aqn_wor", joinColumns = { @JoinColumn(name = "aqn_id") }, inverseJoinColumns = {
      @JoinColumn(name = "wor_id") })
   private List<DAHVenue> my_venius;//where i'm involved

   @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
   @JoinTable(name = "aqn_wor", joinColumns = { @JoinColumn(name = "aqn_id") }, inverseJoinColumns = {
     @JoinColumn(name = "wor_id") })
   private List<DAHOffice> my_offices;


   @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
     @JoinColumn(name = "wor_id") 
   private DAHMaster my_master;

   @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
     @JoinColumn(name = "wor_id") 
   private DAHAcademic my_academic;












    
}

package com.DAH.graphEducation.Models.Users;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph.DAHClusters;
import com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph.DAHNode;
import com.DAH.graphEducation.Models.Users.Ofices.DAHOffice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

   @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
   private List<DAHNode> my_nodes;

   
   @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
   private List<DAHClusters> my_clusters;




  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLast_name() {
    return this.last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getCreated_at() {
    return this.created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public List<DAHVenue> getMy_venius() {
    return this.my_venius;
  }

  public void setMy_venius(List<DAHVenue> my_venius) {
    this.my_venius = my_venius;
  }

  public List<DAHOffice> getMy_offices() {
    return this.my_offices;
  }

  public void setMy_offices(List<DAHOffice> my_offices) {
    this.my_offices = my_offices;
  }

  public List<DAHNode> getMy_nodes() {
    return this.my_nodes;
  }

  public void setMy_nodes(List<DAHNode> my_nodes) {
    this.my_nodes = my_nodes;
  }

  public List<DAHClusters> getMy_clusters() {
    return this.my_clusters;
  }

  public void setMy_clusters(List<DAHClusters> my_clusters) {
    this.my_clusters = my_clusters;
  }












    
}

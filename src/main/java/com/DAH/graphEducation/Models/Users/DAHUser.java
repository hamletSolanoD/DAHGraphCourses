package com.DAH.graphEducation.Models.Users;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph.DAHClusters;
import com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph.DAHNode;

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

   @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
   @JoinTable(name = "user_master_nodes", joinColumns = { @JoinColumn(name = "dah_user_id") }, inverseJoinColumns = {
    @JoinColumn(name = "dah_node_id") })
   private List<DAHNode> my_nodes; // nodes where im master

   
   @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
   @JoinTable(name = "users_clusters", joinColumns = { @JoinColumn(name = "dah_user_id") }, inverseJoinColumns = {
    @JoinColumn(name = "dah_cluster_id") })
   private List<DAHClusters> my_clusters;

   
   @ManyToMany
   @JoinTable(
       name = "user_active_nodes", // nombre de la tabla de unión
       joinColumns = @JoinColumn(name = "user_id"), // clave foránea para DAHUser
       inverseJoinColumns = @JoinColumn(name = "node_id") // clave foránea para DAHNode
   )
   private List<DAHNode> academic_nodes; // Nodos en los que este usuario está involucrado académicamente actualmente.

   @ManyToMany
   @JoinTable
   (
    name = "user_completed_nodes",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "node_id")
   )
    private List<DAHNode> completed_nodes; // Nodos que este usuario ha completado.
    

private String profile_picture;

private String cover_picture;

private String description;


private String phone_number;
@ManyToMany
    @JoinTable(
        name = "user_following",
        joinColumns = @JoinColumn(name = "follower_id"), 
        inverseJoinColumns = @JoinColumn(name = "followed_id")
    )
    private List<DAHUser> following; 

    @ManyToMany(mappedBy = "following")
    private List<DAHUser> followers; 

@ManyToMany
@JoinTable(
    name = "user_likes_clusters",
    joinColumns = @JoinColumn(name = "user_id"), 
    inverseJoinColumns = @JoinColumn(name = "cluster_id") 
)
private List<DAHClusters> liked_clusters; 



@ManyToMany
@JoinTable(
    name = "liked_nodes",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "node_id")
)
private List<DAHNode> liked_nodes;

@ManyToMany
@JoinTable(
    name = "liked_venues",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "venue_id")
)
private List<DAHVenue> liked_venues;








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


  public List<DAHNode> getAcademic_nodes() {
    return this.academic_nodes;
  }

  public void setAcademic_nodes(List<DAHNode> academic_nodes) {
    this.academic_nodes = academic_nodes;
  }

  public List<DAHNode> getCompleted_nodes() {
    return this.completed_nodes;
  }

  public void setCompleted_nodes(List<DAHNode> completed_nodes) {
    this.completed_nodes = completed_nodes;
  }

  public String getProfile_picture() {
    return this.profile_picture;
  }

  public void setProfile_picture(String profile_picture) {
    this.profile_picture = profile_picture;
  }

  public String getCover_picture() {
    return this.cover_picture;
  }

  public void setCover_picture(String cover_picture) {
    this.cover_picture = cover_picture;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPhone_number() {
    return this.phone_number;
  }

  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  public List<DAHUser> getFollowers() {
    return this.followers;
  }

  public void setFollowers(List<DAHUser> followers) {
    this.followers = followers;
  }


  public List<DAHUser> getFollowing() {
    return this.following;
  }

  public void setFollowing(List<DAHUser> following) {
    this.following = following;
  }


  public List<DAHClusters> getLiked_clusters() {
    return this.liked_clusters;
  }

  public void setLiked_clusters(List<DAHClusters> liked_clusters) {
    this.liked_clusters = liked_clusters;
  }

  public List<DAHNode> getLiked_nodes() {
    return this.liked_nodes;
  }

  public void setLiked_nodes(List<DAHNode> liked_nodes) {
    this.liked_nodes = liked_nodes;
  }

  public List<DAHVenue> getLiked_venues() {
    return this.liked_venues;
  }

  public void setLiked_venues(List<DAHVenue> liked_venues) {
    this.liked_venues = liked_venues;
  }













    
}

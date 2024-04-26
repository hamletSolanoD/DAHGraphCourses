package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

import java.util.Date;
import java.util.List;

import com.DAH.graphEducation.Models.DAHUniversity.GraphUtilities.NodeCommentaries;
import com.DAH.graphEducation.Models.Users.DAHVenue;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Id;

@Entity
// un cluster esta compuesto por nodes pero un node puede ser 
public class DAHNode {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private String code;

    private boolean blocked; // ver relacion List<DahNode> prerequisites
    
    private String title;

    private String description;

    private Date created_at = new Date();

    private Date updated_at;

    private String status;
    // tiempo estimado de duracion
    private Date estimated_investment_time;
    // TODO: Correcion de relaciones  (explicaicon) ver modelo DAHUser en relacion followers
    
    @OneToMany
    // nos estamos llamando a nosotros mismo por que el atributo prerequisites de un nodo puede tener como su valor muchos nodos, si el nodo que existe como valor de otro nodo esta bloqueado, el nodo padre estara bloqueado tambien
    // Ver el atributo blocked
    private List<DAHNode> prerequisites;

    // relacion de mi tabla a muchos nodos recomendados
    @OneToMany
    private List<DAHNode> suggested_follow_ups;
    // ver modelo DAHClusters.java atributo is_sequential_order_by_priority
    // si el dahcluster es secuencial lo ordenara por prioridad
    // TODO: establcer el estandar de ptrioridad para los nodos en controller
    private int priority;//when sequential actived it will order the nodes by its priority

    @OneToMany
    // TODO: Establecer la diferencia entre submit de proyecto y comentarios 
    // NodeCommentaries es entidad, es un foro en el nodo y esta definido en modelo:NodeCommentaries.java
    // el comentario puede un submit de proyecto ("practica recomendadada" en planeaciones) o un comentario del nodo 
    private List<NodeCommentaries> commentaries;

    private boolean presencial_activity; 

    private boolean DAHUser_approvment_required;
    // TODO: Correcion 
    private DAHVenue venue;//if PresencialActivity is true this will be the place where the activity will be held;




    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isBlocked() {
        return this.blocked;
    }

    public boolean getBlocked() {
        return this.blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEstimated_investment_time() {
        return this.estimated_investment_time;
    }

    public void setEstimated_investment_time(Date estimated_investment_time) {
        this.estimated_investment_time = estimated_investment_time;
    }

    public List<DAHNode> getPrerequisites() {
        return this.prerequisites;
    }

    public void setPrerequisites(List<DAHNode> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public List<DAHNode> getSuggested_follow_ups() {
        return this.suggested_follow_ups;
    }

    public void setSuggested_follow_ups(List<DAHNode> suggested_follow_ups) {
        this.suggested_follow_ups = suggested_follow_ups;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

   
    public List<NodeCommentaries> getCommentaries() {
        return this.commentaries;
    }

    public void setCommentaries(List<NodeCommentaries> commentaries) {
        this.commentaries = commentaries;
    }


    public boolean isPresencial_activity() {
        return this.presencial_activity;
    }

    public boolean getPresencial_activity() {
        return this.presencial_activity;
    }

    public void setPresencial_activity(boolean presencial_activity) {
        this.presencial_activity = presencial_activity;
    }

    public boolean isDAHUser_approvment_required() {
        return this.DAHUser_approvment_required;
    }

    public boolean getDAHUser_approvment_required() {
        return this.DAHUser_approvment_required;
    }

    public void setDAHUser_approvment_required(boolean DAHUser_approvment_required) {
        this.DAHUser_approvment_required = DAHUser_approvment_required;
    }

    public DAHVenue getVenue() {
        return this.venue;
    }

    public void setVenue(DAHVenue venue) {
        this.venue = venue;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

















    
}

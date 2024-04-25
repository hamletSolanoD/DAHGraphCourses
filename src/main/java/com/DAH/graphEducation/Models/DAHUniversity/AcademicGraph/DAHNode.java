package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

import java.util.Date;
import java.util.List;

import com.DAH.graphEducation.Models.DAHUniversity.GraphUtilities.NodeCommentaries;
import com.DAH.graphEducation.Models.Users.DAHUser;
import com.DAH.graphEducation.Models.Users.DAHVenue;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DAHNode {


    @ManyToOne
    private DAHUser master;
    
    @ManyToMany
    private List<DAHUser> academics;

    private String code;

    private boolean blocked; // if a DAHNode is blocked and one other DAHNode has its prerequisites
    //the one with blocked only the ones with the complete prerequisites will be able to open it.
    
    private String title;

    private String description;

    private Date created_at;

    private Date updated_at;

    private String status;

    private Date estimated_investment_time;

    private List<DAHNode> prerequisites;

    private List<DAHNode> suggested_follow_ups;

    private int priority;//when sequential actived it will order the nodes by its priority

    private List<DAHUser> likes;

    private List<NodeCommentaries> commentaries;// recommended practices will be posted here by its owners.

    private List<DAHUser> users_who_finished;

    private boolean presencial_activity;

    private boolean DAHUser_approvment_required;

    private DAHVenue venue;//if PresencialActivity is true this will be the place where the activity will be held;




    public DAHUser getMaster() {
        return this.master;
    }

    public void setMaster(DAHUser master) {
        this.master = master;
    }

    public List<DAHUser> getAcademics() {
        return this.academics;
    }

    public void setAcademics(List<DAHUser> academics) {
        this.academics = academics;
    }

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

    public List<DAHUser> getLikes() {
        return this.likes;
    }

    public void setLikes(List<DAHUser> likes) {
        this.likes = likes;
    }

    public List<NodeCommentaries> getCommentaries() {
        return this.commentaries;
    }

    public void setCommentaries(List<NodeCommentaries> commentaries) {
        this.commentaries = commentaries;
    }

    public List<DAHUser> getUsers_who_finished() {
        return this.users_who_finished;
    }

    public void setUsers_who_finished(List<DAHUser> users_who_finished) {
        this.users_who_finished = users_who_finished;
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
















    
}

package com.DAH.graphEducation.Models.DAHUniversity.GraphUtilities;

import java.util.List;

import com.DAH.graphEducation.Models.Users.DAHUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NodeCommentaries {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String tittle;
    private String description;
    private DAHUser author;
    private List<DAHUser> likes;
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DAHUser getAuthor() {
        return this.author;
    }

    public void setAuthor(DAHUser author) {
        this.author = author;
    }

    public List<DAHUser> getLikes() {
        return this.likes;
    }

    public void setLikes(List<DAHUser> likes) {
        this.likes = likes;
    }

    
}

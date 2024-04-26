package com.DAH.graphEducation.Models.DAHUniversity.GraphUtilities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToolsTypes {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    String name;
    String code;
    String description;
    String title;
    String href;


    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

        

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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

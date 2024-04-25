package com.DAH.graphEducation.Models.Users.Ofices;
import jakarta.persistence.Entity;

@Entity
public class DAHGeneration {

    private String name;
    private String Code;
    private int priority;
    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}

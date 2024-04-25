package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

import java.util.Date;
import java.util.List;

import com.DAH.graphEducation.Models.DAHUniversity.DAHAcademic;
import com.DAH.graphEducation.Models.DAHUniversity.DAHMaster;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DAHNode {


    @ManyToOne
    private DAHMaster master;
    
    @ManyToMany
    private List<DAHAcademic> academics;

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











    
}

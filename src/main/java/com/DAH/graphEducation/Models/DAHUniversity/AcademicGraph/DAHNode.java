package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

import java.util.Date;
import java.util.List;

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


















    
}

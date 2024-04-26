package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

import java.util.Date;
import java.util.List;
import com.DAH.graphEducation.Models.DAHUniversity.GraphUtilities.ToolsTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class DAHClusters {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;  

    private String income_profile;
    
    private String outcome_profile;

    @ManyToMany
    @JoinTable(
        name = "cluster_required_tools",
        joinColumns = @JoinColumn(name = "cluster_id"),
        inverseJoinColumns = @JoinColumn(name = "tools_types_id")
    )
    private List<ToolsTypes> required_tools;

    private String code;

    private String description;

    private String title;

    private Date created_at;

    private Date updated_at;

    private String status;

    @ManyToMany
    @JoinTable(
        name = "cluster_nodes",
        joinColumns = @JoinColumn(name = "cluster_id"), 
        inverseJoinColumns = @JoinColumn(name = "node_id") 
    )
    private List<DAHNode> nodes;

    private Boolean secuential_blocked;//if true you cant open the next node until you finish the previous one.

    public String getIncome_profile() {
        return this.income_profile;
    }

    public void setIncome_profile(String income_profile) {
        this.income_profile = income_profile;
    }

    public String getOutcome_profile() {
        return this.outcome_profile;
    }

    public void setOutcome_profile(String outcome_profile) {
        this.outcome_profile = outcome_profile;
    }

    public List<ToolsTypes> getRequired_tools() {
        return this.required_tools;
    }

    public void setRequired_tools(List<ToolsTypes> required_tools) {
        this.required_tools = required_tools;
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

    public List<DAHNode> getNodes() {
        return this.nodes;
    }

    public void setNodes(List<DAHNode> nodes) {
        this.nodes = nodes;
    }

    public Boolean isSecuential_blocked() {
        return this.secuential_blocked;
    }

    public Boolean getSecuential_blocked() {
        return this.secuential_blocked;
    }

    public void setSecuential_blocked(Boolean secuential_blocked) {
        this.secuential_blocked = secuential_blocked;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
}

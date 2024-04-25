package com.DAH.graphEducation.Models.DAHUniversity;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph.DAHClusters;
import com.DAH.graphEducation.Models.Users.DAHUser;

import jakarta.persistence.Entity;

@Entity
public class DAHAcademic {

    private String code;

    private List<DAHClusters> clusters;

    public Optional<DAHAcademic> initializeClusters(DAHUser user){
        this.clusters = new ArrayList<DAHClusters>();
        DAHClusters GenericCluster = new DAHClusters();
        GenericCluster.setCode("GenericCluster");
        GenericCluster.setDescription("This cluster contains all the generic nodes that do not belong to any other cluster.");
        GenericCluster.setOwner(user);
        this.clusters.add(GenericCluster);
        return Optional.of(this);

    }



    
}

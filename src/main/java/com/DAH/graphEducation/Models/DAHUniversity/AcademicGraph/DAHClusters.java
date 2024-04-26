package com.DAH.graphEducation.Models.DAHUniversity.AcademicGraph;

// clusters = cursos o coleccion (pinterest ) dentro de esta coleccion estaria los nodos (sesiones) pueden ser cualquier cosa, como 
// ejemplos; wiki de slgun tema, es un grupo de datos 
//los datos son versatiles por sus validaciones y se conectan con los grupos como lo que se setee al crerlo, como un curso secuencial o 
//podemos tener un dah cluster que no sea secuencial pero que algunos de sus nodos si tengan secuencia entre si, 
// un dah cluster lo pueden crear uno o mas dahmaster (todo how to dev seria un cluster)
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
// 
@Entity 
// con este decorador le dices que es una tabla en base de datos 
// un da cluster creado seria un registro en esta tabla 
public class DAHClusters {
// private = atributos del modelo que serian columnas en su base de datos 
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;  
    // income_profile y outcome_profile son el perfil de ingreso y egreso 
// cuando un dah user se registre al momento de hacer con que perfil se te recomendaria
    private String income_profile;
    
    private String outcome_profile;
// tipos de relaciones entre tablas 
    @ManyToMany
    @JoinTable(
        name = "cluster_required_tools",
        joinColumns = @JoinColumn(name = "cluster_id"),
        // tools_types son tecnologias requeridas 
        inverseJoinColumns = @JoinColumn(name = "tools_types_id")
    )
    // un dah cluster tiene una lista de herramientas requeridas, un dahcluster puede ser un required_tool,por ejemplo,  en el dah cluster un un alumno que tomo mi curso
    private List<ToolsTypes> required_tools;
// el code es el enmascarador de el id, con el que los dah users lo buscaran 
    private String code;

    private String description;

    private String title;

    private Date created_at = new Date(); // fecha actual

    private Date updated_at;

    private String status;

    @ManyToMany // el tipo de relacion muchos a muchos 
    // crea una tabla in termedia
    @JoinTable(
        // nombre de la tabla intermedia, la estas creando 
        name = "cluster_nodes",
        // 
        joinColumns  = @JoinColumn(name = "cluster_id"), 
        inverseJoinColumns = @JoinColumn(name = "node_id") 
    )

    
    // TABLAS INTERMEDIAS
    // esta apunta a dahNode.java (otro modelo) y arriba hicimos la relacion, es una tabla por la relacion entre dah cluster y dahNode, pero aqui en dah cluster es un atributo
    private List<DAHNode> nodes; // aqui van los nodos, temas internos 

    //metodos que mandan a llamar atributos privados, getter y setters
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
}

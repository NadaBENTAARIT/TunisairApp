package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

import com.example.demo.enums.EType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Entity
public class Vol {
	
	
	
	@Id
	  private long id;
	  private String reference;
	  private Date dateDepart;
	  private Date dateArrivee;
	  private Date heureDepart;
	  private Date heureArrivee;
	  private String aeroportDepart;
	  private String aeroportArrivee;
	  private String etat;
	  private EType type;
	  private double prix;
	  
	  @ManyToOne
	  private Avion avion;
	  
	  @JsonIgnore
	  @OneToMany(cascade = CascadeType.ALL, mappedBy = "vol")
	  private List<Conduiteur> conduiteurs;
	  


	  






	
	
	
	
	
	
	
}

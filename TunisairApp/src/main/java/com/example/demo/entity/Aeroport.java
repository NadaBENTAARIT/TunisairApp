package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Entity
public class Aeroport {
	@Id
	  private long id;
	  private String nom;
	  
	  @JsonIgnore
	  @OneToMany(cascade = CascadeType.ALL, mappedBy = "aeroportDepart")
	  private List<Vol> vols;
	  
	  @JsonIgnore
	  @OneToMany(cascade = CascadeType.ALL, mappedBy = "aeroportArrivee")
	  private List<Vol> volss;
	  
	  @ManyToOne
	  private Ville ville;
	  
}

package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Ville {
	
	@Id
	  private long id;
	  private String nom;
	  
	  @JsonIgnore
	  @OneToMany(cascade = CascadeType.ALL, mappedBy = "ville")
	  private List<Aeroport> aeroports;

}

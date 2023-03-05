package com.example.demo.entity;



import java.sql.Date;
import java.util.List;

import com.example.demo.enums.ERole;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Entity

public class Conduiteur {
	
	@Id
	  private long id;
	  private String nom;
	  private String prenom;
	  private String tel;
	  private ERole role;
	  @OneToOne
	  private Vol vol;





}

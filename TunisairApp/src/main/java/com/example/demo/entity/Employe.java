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
public class Employe {
    @Id
    private long id;
    private String nom;
    private String prenom;
    private String tel;




}

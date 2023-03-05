package com.example.demo.entity;

import java.util.HashSet;

import java.util.Set;





import jakarta.persistence.*;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

@Setter
@Entity
public class Staff {
    @Id
    private long id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "staff_employee",
            joinColumns = @JoinColumn(name = "id_staff"),
            inverseJoinColumns = @JoinColumn(name = "id_employe"))
    private Set<Employe> employes = new HashSet<>();
}


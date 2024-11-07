package org.example.utilisateurservice.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@AllArgsConstructor()
@Inheritance(strategy = InheritanceType.JOINED)
public  class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;


    public Utilisateur() {

    }
}


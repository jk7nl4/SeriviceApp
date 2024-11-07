package org.example.utilisateurservice.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Etudiant extends Utilisateur {

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @Enumerated(EnumType.STRING)
    private Groupe groupe;

    // Getters et Setters
}

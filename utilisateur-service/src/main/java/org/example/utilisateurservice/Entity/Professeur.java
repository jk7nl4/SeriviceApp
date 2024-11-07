package org.example.utilisateurservice.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Professeur extends Utilisateur {
    private String domaineSpecialisation;


}


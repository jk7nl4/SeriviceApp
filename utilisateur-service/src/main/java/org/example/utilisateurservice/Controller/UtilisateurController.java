package org.example.utilisateurservice.Controller;



import org.example.utilisateurservice.Entity.Etudiant;
import org.example.utilisateurservice.Entity.Professeur;
import org.example.utilisateurservice.Entity.Utilisateur;
import org.example.utilisateurservice.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping("/etudiant")
    public Utilisateur creerEtudiant(@RequestBody Etudiant etudiant) {
        return utilisateurService.creerUtilisateur(etudiant);
    }

    @PostMapping("/professeur")
    public Utilisateur creerProfesseur(@RequestBody Professeur professeur) {
        return utilisateurService.creerUtilisateur(professeur);
    }

    @GetMapping
    public List<Utilisateur> obtenirTousUtilisateurs() {
        return utilisateurService.obtenirTousUtilisateurs();
    }
}



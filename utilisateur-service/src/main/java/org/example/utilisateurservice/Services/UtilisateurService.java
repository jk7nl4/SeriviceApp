package org.example.utilisateurservice.Services;

;
import org.example.utilisateurservice.Entity.Utilisateur;
import org.example.utilisateurservice.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> obtenirTousUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}

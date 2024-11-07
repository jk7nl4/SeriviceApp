package org.example.utilisateurservice.Repository;

import org.example.utilisateurservice.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {}

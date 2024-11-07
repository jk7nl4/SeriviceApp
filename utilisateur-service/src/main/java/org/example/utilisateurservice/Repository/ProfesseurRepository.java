package org.example.utilisateurservice.Repository;

import org.example.utilisateurservice.Entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {}


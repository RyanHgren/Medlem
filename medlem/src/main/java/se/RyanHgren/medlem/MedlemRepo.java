package se.ryanhgren.medlem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.medlem.model.Medlem;

public interface MedlemRepo extends JpaRepository<Medlem, Long> {
    
}

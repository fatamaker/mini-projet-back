package com.fatma.Formations2.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fatma.Formations2.entities.Theme;

@RepositoryRestResource(path = "thm")
@CrossOrigin("*")

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    // Custom query methods (if any) go here
}

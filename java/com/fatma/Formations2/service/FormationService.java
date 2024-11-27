package com.fatma.Formations2.service;

import java.util.List;

import com.fatma.Formations2.entities.Formation;
import com.fatma.Formations2.entities.Theme;

public interface FormationService {
	
	Formation saveFormation(Formation f);
	Formation updateFormation(Formation f);
	void supprimerFormation(Formation f);
	void supprimerFormationById(Long id);
	Formation getFormation(Long id);
	List<Formation> getAllFormations();
	List<Formation> findByNomFormation(String nom);
	List<Formation> findByNomFormationContains(String nom); 
	List<Formation> findByNomPrix(String nom,int prix);
	List<Formation> findByTheme (Theme theme);
	List<Formation> findByThemeIdTheme(long l);
	List<Formation> findByOrderByNomFormationAsc();
	List<Formation> trierFormationsNomsPrix();
	List<Formation> getFormationsByThemeId(Long idTheme);

	


}

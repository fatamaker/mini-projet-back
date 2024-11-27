package com.fatma.Formations2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatma.Formations2.entities.Formation;
import com.fatma.Formations2.entities.Theme;
import com.fatma.Formations2.repos.FormationRepository;
import com.fatma.Formations2.repos.ThemeRepository;

@Service
public class FormationServiceImpl implements FormationService {
	@Autowired
	FormationRepository formationRepository;
	 ThemeRepository themeRepository ;

	@Override
	public Formation saveFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public Formation updateFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public void supprimerFormation(Formation f) {
		 formationRepository.delete(f);
		
	}

	@Override
	public void supprimerFormationById(Long id) {
		formationRepository.deleteById(id);
		
	}

	@Override
	public Formation  getFormation(Long id) {
		return formationRepository.findById(id).get();
	}

	@Override
	public List<Formation> getAllFormations() {
		return formationRepository.findAll();
	}

	@Override
	public List<Formation> findByNomFormation(String nom) {
		return formationRepository.findByNomFormation(nom);
	}

	@Override
	public List<Formation> findByNomFormationContains(String nom) {
		return formationRepository.findByNomFormationContains(nom);
	}

	@Override
	public List<Formation> findByNomPrix(String nom, int prix) {
		return formationRepository.findByNomPrix(nom,prix);	}

	@Override
	public List<Formation> findByTheme(Theme theme) {
		return formationRepository.findByTheme(theme);
	}

	@Override
	public List<Formation> findByThemeIdTheme(long l) {
		return formationRepository.findByThemeIdTheme(l);
	}

	@Override
	public List<Formation> findByOrderByNomFormationAsc() {
		
		return formationRepository.findByOrderByNomFormationAsc();
	}

	@Override
	public List<Formation> trierFormationsNomsPrix() {
		return formationRepository.trierFormationsNomsPrix();
	}

	public List<Formation> getFormationsByThemeId(Long idTheme) {
        return formationRepository.findByThemeIdTheme(idTheme);
    }

	
}

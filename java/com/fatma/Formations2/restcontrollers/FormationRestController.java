package com.fatma.Formations2.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatma.Formations2.entities.Formation;
import com.fatma.Formations2.service.FormationService;



@RestController
@RequestMapping("/api")
@CrossOrigin("*") 
public class FormationRestController {
	
	@Autowired
	FormationService formationService;
	
	@GetMapping
	public List<Formation> getAllFormations() {
		return formationService.getAllFormations();
	}
	
	@GetMapping("/{id}")
    public Formation getProduitById(@PathVariable("id") Long id) {
        return formationService.getFormation(id);
    }
	
	@GetMapping("/thm/{idTheme}")
	public ResponseEntity<List<Formation>> getFormationsByThemeId(@PathVariable("idTheme") Long idTheme) {
	    List<Formation> formations = formationService.getFormationsByThemeId(idTheme);
	    return formations.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(formations);
	}
	
	@PostMapping
	public Formation createProduit(@RequestBody Formation formation) {
	    return formationService.saveFormation(formation);
	}
		
	@PutMapping
	public Formation updateProduit(@RequestBody Formation formation) {
	    return formationService.updateFormation(formation);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
	    formationService.supprimerFormationById(id);
	}
	
	@RequestMapping(value="/formthem/{idTheme}",method = RequestMethod.GET)
	public List<Formation> getFormationByIdTheme(@PathVariable Long idTheme) {
	    return formationService.findByThemeIdTheme(idTheme);
	}

	@RequestMapping(value="/formsByName/{nom}",method = RequestMethod.GET) 
	public List<Formation> findByNomFormationContains(@PathVariable("nom") String nom) { 
	return formationService.findByNomFormationContains(nom);
	}


}

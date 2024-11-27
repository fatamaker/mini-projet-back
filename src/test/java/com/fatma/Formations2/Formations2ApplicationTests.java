package com.fatma.Formations2;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatma.Formations2.entities.Formation;
import com.fatma.Formations2.entities.Theme;
import com.fatma.Formations2.repos.FormationRepository;

@SpringBootTest

class Formations2ApplicationTests {

	@Autowired
	private FormationRepository formationRepository;
	
	@Test
	public void testCreateFormation() {
		 Formation formation = new Formation(
		            "Formation UX UI Design",
		            1200,
		            LocalDate.of(2025,01,12),
		            LocalDate.of(2025, 02, 11),
		            "en ligne"
		        );
		        
		        formationRepository.save(formation);
	}
	
	 @Test
	 public void testFindFormation()
	 {
		 Formation f= formationRepository.findById(1L).get();
	     System.out.println(f);
	 }
	 
	 @Test
	 public void testUpdateProduit()
	 {
	 Formation f = formationRepository.findById(1L).get();
	 f.setPrixFormation(2000);
	 formationRepository.save(f);
	 }
	 
	 @Test
	 public void testDeleteFormation()
	 {
		 formationRepository.deleteById(1L);;
	 }
	 
	 @Test
	 public void testListerTousProduits()
	 {
	 List<Formation> prods =  formationRepository.findAll();
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 @Test
	 public void testFindByNomProduit 	(){
	 List<Formation> prods = formationRepository.findByNomFormation("e"); 
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 
	 @Test
	 public void testFindByNomProduitContains (){
	 List<Formation> prods = formationRepository.findByNomFormationContains("Formation"); 
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Formation> prods = formationRepository.findByNomPrix("Formation UX UI Design", 1000);
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 @Test
	 public void testfindByTheme ()
	 {
		Theme  cat = new Theme ();
	 cat.setIdTheme(1L);
	 List<Formation> prods = formationRepository.findByTheme(cat);
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 @Test
	 public void findByThemeIdTheme()
	 {
	 List<Formation> prods = formationRepository.findByThemeIdTheme(1L);
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomFormationAsc()
	 {
	 List<Formation> prods =formationRepository.findByOrderByNomFormationAsc();
	 for (Formation f : prods)
	 {
	 System.out.println(f);
	 }
	 }
	 
	 @Test
	 public void testTrierFormationsNomsPrix()
	 {
	 List<Formation> prods = formationRepository.trierFormationsNomsPrix();
	 for (Formation p : prods)
	 {
	 System.out.println(p);
	 }
	 }

	


}

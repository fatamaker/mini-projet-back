package com.fatma.Formations2.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomFor", types = { Formation.class })
public interface FormationProjection {
	
	public String getNomFormation();


}

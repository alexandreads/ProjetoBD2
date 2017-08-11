package com.ads.bd2.agenda.persistencia;

import javax.persistence.EntityManager;

import com.ads.bd2.agenda.modelo.Usuario;

public class DAOJPAUsuario extends DAOJPA<Usuario> {

	public DAOJPAUsuario(EntityManager em) {
		super(em);
	}

	@Override
	public Class<Usuario> getDAOClass() {
		return Usuario.class;
	}
	
	
	public void create(Usuario usuario){
		
		
		em.merge(usuario);
		
		
	}
	
	//CRIAR OUTRAS CONSULTAS COM JPQL CAPAZES DE RETORNAR COMO RESULTADO UMA OU MAIS INSTANCIAS DESTE OBJETO, 
	//SE APLICAVEL NO QUE O PROJETO PEDE. EX.: public List<LatitudeLongitude> getLatitudeEntre(double x, double y, double x2, double y2)

}

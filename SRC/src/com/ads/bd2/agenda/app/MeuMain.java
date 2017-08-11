package com.ads.bd2.agenda.app;

import javax.persistence.EntityManager;

import com.ads.bd2.agenda.modelo.Lembrete;
import com.ads.bd2.agenda.modelo.NotificacaoLembrete;
import com.ads.bd2.agenda.modelo.Usuario;
import com.ads.bd2.agenda.persistencia.DAOJPA;
import com.ads.bd2.agenda.persistencia.DAOJPAUsuario;

public class MeuMain {

	public MeuMain() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
		
		
		Usuario u = new Usuario();
		u.setNome("liaf");
		
		
		
		EntityManager entityManager = DAOJPA.createAndInitEntityManager();
		entityManager.getTransaction().begin();
		
		DAOJPA<Usuario> daoU = new DAOJPAUsuario(entityManager);
		
		Lembrete l = new Lembrete();
		NotificacaoLembrete no = new NotificacaoLembrete();
		
		u.getNotificacoes().add(no);
		
		daoU.create(u);
		
	
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}

}

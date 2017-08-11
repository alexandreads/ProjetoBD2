package com.ads.bd2.agenda.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificacaoLembrete {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	
	private Date dataHoraLembrar;

	private ModoNotificacao modo;

	private boolean confirmado;

	private Usuario usuario;

	public Date getDataHoraLembrar() {
		return dataHoraLembrar;
	}

	public void setDataHoraLembrar(Date dataHoraLembrar) {
		this.dataHoraLembrar = dataHoraLembrar;
	}

	public ModoNotificacao getModo() {
		return modo;
	}

	public void setModo(ModoNotificacao modo) {
		this.modo = modo;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}

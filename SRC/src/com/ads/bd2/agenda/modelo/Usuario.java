package com.ads.bd2.agenda.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	
	@ManyToMany(mappedBy="usuarios")
	private ArrayList<Lembrete> lembretes = new ArrayList<Lembrete>();
	
	@OneToMany
	@JoinColumn(name="usuario_id") // nome da fk 
	private ArrayList<NotificacaoLembrete> notificacoes = new ArrayList<NotificacaoLembrete>();
	
	private String nome;

	private Date dataNascimento;

	private int login;

	private int senha;

	private int email;

	
//	removi essa qu eestava como collection, eu refasso tudo com array list
//	private Collection<Lembrete> lembrete;



	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Lembrete> getLembretes() {
		return lembretes;
	}

	public void setLembretes(ArrayList<Lembrete> lembretes) {
		this.lembretes = lembretes;
	}

	public ArrayList<NotificacaoLembrete> getNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(ArrayList<NotificacaoLembrete> notificacoes) {
		this.notificacoes = notificacoes;
	}

	
	
	
	
	
	
}

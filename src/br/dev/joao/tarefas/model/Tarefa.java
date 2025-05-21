package br.dev.joao.tarefas.model;

import java.time.LocalDate;

public class Tarefa {

	private String nome;
	private String descricao;
	private LocalDate datainicio;
	private int prazo;
	private LocalDate dataPrevisaoDeEntrega;
	private LocalDate dataEntrega;
	private Status status;
	private Funcionario responsavel;
	
	public Tarefa() {
		System.out.println("Criando uma tarefa...");
	}
	
	public Tarefa(String nome) {
		System.out.println("Criando uma tarefa..." +nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public LocalDate getDataPrevisaoDeEntrega() {
		return dataPrevisaoDeEntrega;
	}

	public void setDataPrevisaoDeEntrega(LocalDate dataPrevisaoDeEntrega) {
		this.dataPrevisaoDeEntrega = dataPrevisaoDeEntrega;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

}

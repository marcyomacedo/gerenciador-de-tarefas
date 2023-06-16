package br.com.gerenciador.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.gerenciador.model.Tarefa;

@Named
@SessionScoped
public class TarefaMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject	
	private Tarefa tarefa;
	
	public String adicionar() {
		
		System.out.println("metodo ativo");
		
		limpar();
		
		return null;		
		
	}
	
	private void limpar() {
		tarefa = new Tarefa();
	}
	
	

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	

}

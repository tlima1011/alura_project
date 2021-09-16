package com.alura_project.main;

class Turma{
	
	Aluno [] alunos; 
	
	void imprimeNotas() { 
		for(int i = 0; i < this.alunos.length;i++) {
			Aluno aluno = this.alunos[i]; 
			if(aluno == null) continue;
			System.out.println("Nome: " + aluno.getNome() + " - Nota: " +aluno.getNota());
		}
	}
}

class Aluno{
	
	private String nome; 
	private int nota;
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNota(int nota) {
		this.nota = nota; 
	}
	
	public int getNota() {
		return nota; 
	}
}

public class TesteDaTurma {

	public static void main(String[] args) {
		
		Turma fj11 = new Turma();
		
		fj11.alunos = new Aluno[10]; 
		
		fj11.alunos[0] = new Aluno(); 
		fj11.alunos[0].setNome("Aristeu fernandes genovesion");
		fj11.alunos[0].setNota(8); 
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].setNome("Xilvania Solagne stephany"); 
		fj11.alunos[1].setNota(7); 
		
		fj11.alunos[2] = new Aluno(); 
		fj11.alunos[2].setNome("Givlan Marciuclides"); 
		fj11.alunos[2].setNota(9); 
		
		fj11.alunos[3] = new Aluno(); 
		fj11.alunos[3].setNome("Maxtrogildo Gereba"); 
		fj11.alunos[3].setNota(5); 
		
				
		fj11.imprimeNotas();

	}

}

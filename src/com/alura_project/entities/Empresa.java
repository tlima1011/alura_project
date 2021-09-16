package com.alura_project.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura_project.exception.ValorInvalido;

public class Empresa {
	
	private static final String NOME = "Empresa S.A."; 
	private static final String CNPJ = "555555/33"; 
	private int cod = 0;
	
	public static Funcionario[] funcionarios = new Funcionario[10]; 
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Empresa() { 
	}
	
	public static void adicionar(Funcionario f, int c) throws ValorInvalido{
		//int i = 0; 	
		if(funcionarios[c] != null) {
			throw new ValorInvalido("Funcionario ja ocupa no espaco existente");
		}
		else {
			funcionarios[c] = new Funcionario(f.getNome(), f.getDepartamento(), f.getRg(), f.getDataEntrada(), f.getSalario());
			System.out.println("Funcionario: " + f.getNome() +" adicionado na posição: " +c);
		}
	}
	
	public String getFuncionario (int posicao) throws ValorInvalido {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();
		System.out.println("Busca de Funcionario: ");
		System.out.println("Data de Hoje: " +formataData.format(now));
		String nome = ""; 
		if(funcionarios[posicao] == null) {
			throw new ValorInvalido("Funcionario nao encontrado");
		}else {
			nome = "\nNome: "+funcionarios[posicao].getNome() + "\nData de Admissao: "+formataData.format(funcionarios[posicao].getDataEntrada());
		}
		return nome; 
	}
		
	public static void mostrarDadosFuncionarios() { 
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy"); 
		Date now = new Date(); 
		System.out.println("Nome da Empresa: " +NOME);
		System.out.println("CNPJ Empresa: " +CNPJ);
		System.out.println("Data de Hoje: " +formataData.format(now));
		System.out.println("FUNCIONARIOS: ");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i < funcionarios.length; i++) {
			Funcionario funcs = funcionarios[i];
			if(funcs == null) continue;
			System.out.print("Codigo Funcionario: "+i+"\nNome: " + funcs.getNome()
					+"\nDepartamento: " + funcs.getDepartamento()
					+"\nRG: " + funcs.getRg()
					+"\nData: " +formataData.format(funcs.getDataEntrada()) 
					+"\nSalario Ganho Anual - R$" +String.format("%.2f", funcs.getSalario())+"\n");
			System.out.println("--------------------------------------------------");
		}
	}
}
